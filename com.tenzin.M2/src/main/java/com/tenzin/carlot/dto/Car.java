package com.tenzin.carlot.dto;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Jun 5, 2020
 */
public class Car {

    private String VIN;
    private String make;
    private String model;
    private String color;

    private BigDecimal price;
    private long odometerMiles;

    private CarKey key;

    public Car(String VIN, String make, String model, String color, BigDecimal price, long odometerMiles, CarKey key) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometerMiles = odometerMiles;
        this.key = key;
    }

   
    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getOdometerMiles() {
        return odometerMiles;
    }

    public void setOdometerMiles(long odometerMiles) {
        this.odometerMiles = odometerMiles;
    }

    public CarKey getKey() {
        return key;
    }

    public void setKey(CarKey key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.VIN);
        hash = 83 * hash + Objects.hashCode(this.make);
        hash = 83 * hash + Objects.hashCode(this.model);
        hash = 83 * hash + Objects.hashCode(this.color);
        hash = 83 * hash + Objects.hashCode(this.price);
        hash = 83 * hash + (int) (this.odometerMiles ^ (this.odometerMiles >>> 32));
        hash = 83 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.odometerMiles != other.odometerMiles) {
            return false;
        }
        if (!Objects.equals(this.VIN, other.VIN)) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "VIN=" + VIN + ", make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + ", odometerMiles=" + odometerMiles + ", key=" + key + '}';
    }

}
