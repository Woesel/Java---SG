package com.tenzin.carlot.service;

import com.tenzin.carlot.dao.CarLotDAO;
import com.tenzin.carlot.dto.Car;
import com.tenzin.carlot.dto.CarKey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Jun 7, 2020
 */
public class CarLotServiceImpl implements CarLotService {

    private CarLotDAO dao;

    public CarLotServiceImpl(CarLotDAO dao) {
        this.dao = dao;
    }

    @Override
    public Car getACar(String VIN) {
        return dao.getCar(VIN);
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList(dao.getCars());
    }

    @Override
    public List<Car> getCarsByColor(String color) {

        List<Car> allCar = dao.getCars();
        List<Car> carList = new ArrayList<>();

        for (Car currentCar : allCar) {

            if (currentCar.getColor() == color) {
                carList.add(currentCar);
            }
        }
        return carList;

    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        List<Car> allCar = dao.getCars();
        List<Car> budgetCars = new ArrayList<>();

        for (Car currentCar : allCar) {

            if (currentCar.getPrice().compareTo(maxPrice) <= 0) {

                budgetCars.add(currentCar);
            }
        }
        return budgetCars;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        List<Car> specialCar = new ArrayList<>();

        for (Car currentCar : dao.getCars()) {
            if (currentCar.getMake() == make && currentCar.getModel() == model) {
                specialCar.add(currentCar);
            }
        }
        return specialCar;
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {

        Car discountedCar;

        if (dao.getCar(VIN) != null) {
            discountedCar = dao.getCar(VIN);
        } else {
            throw new NoSuchCarException("No such car available.");
        }

        BigDecimal discountedPrice = discountedCar.getPrice();
        BigDecimal hundo = new BigDecimal("100");
        //originaPrice - originalPrice x percentDiscount/100
        BigDecimal newPrice = discountedPrice.subtract(discountedPrice.multiply(percentDiscount.divide(hundo)));

        return newPrice;
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        Car carToSell, sellCar = null;

        if (dao.getCar(VIN) == null) {
            throw new NoSuchCarException("No such car available.");
        } else {
            carToSell = dao.getCar(VIN);
        }

        BigDecimal priceOfCar = carToSell.getPrice();

        if (cashPaid.equals(priceOfCar)) {

            sellCar = dao.removeCar(VIN);

        } else if (cashPaid.intValue() > priceOfCar.intValue()) {
            throw new OverpaidPriceException("Customer paid extra money.");
        } else if (cashPaid.intValue() < priceOfCar.intValue()) {
            throw new UnderpaidPriceException("Customer didn't pay enough money.");
        }
        return sellCar.getKey();
    }

}
