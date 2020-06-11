package com.tenzin.carlot.dto;

import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Jun 5, 2020
 */
public class CarKey {

    private String VIN;
    private boolean laserCut;

    public CarKey(String VIN, boolean laserCut) {
        this.VIN = VIN;
        this.laserCut = laserCut;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public boolean isLaserCut() {
        return laserCut;
    }

    public void setLaserCut(boolean laserCut) {
        this.laserCut = laserCut;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.VIN);
        hash = 79 * hash + (this.laserCut ? 1 : 0);
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
        final CarKey other = (CarKey) obj;
        if (this.laserCut != other.laserCut) {
            return false;
        }
        if (!Objects.equals(this.VIN, other.VIN)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CarKey{" + "VIN=" + VIN + ", laserCut=" + laserCut + '}';
    }

}
