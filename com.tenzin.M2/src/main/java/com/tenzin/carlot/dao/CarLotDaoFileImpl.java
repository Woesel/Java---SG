
package com.tenzin.carlot.dao;

import com.tenzin.carlot.dto.Car;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tenzin Woesel
 * Jun 7, 2020
 */
public class CarLotDaoFileImpl implements CarLotDAO{
    
    private Map<String, Car> cars = new HashMap<>();
    
    @Override
    public Car addCar(String VIN, Car car) {
        Car newCar = cars.put(VIN, car);
        return newCar;
    }

    @Override
    public Car getCar(String VIN) {
        return cars.get(VIN);
    }

    @Override
    public List<Car> getCars() {
        return new ArrayList(cars.values());
    }

    @Override
    public void editCar(String VIN, Car car) {
        cars.replace(VIN, car);
    }

    @Override
    public Car removeCar(String VIN) {
        Car removedCar = cars.remove(VIN);
        return removedCar;
    }

}
