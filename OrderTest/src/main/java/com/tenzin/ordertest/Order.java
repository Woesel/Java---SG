
package com.tenzin.ordertest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel
 * Jul 8, 2020
 */
public class Order {
    private LocalDate dateOfOrder;
    private int orderNumber;
    private String customerName;
    private BigDecimal area;
    public Order(LocalDate dateOfOrder, int orderNumber, String customerName, BigDecimal area) {
        this.dateOfOrder = dateOfOrder;
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.area = area;
    }
    public BigDecimal getArea() {
        return area;
    }
    public void setArea(BigDecimal area) {
        this.area = area;
    }
    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dateOfOrder);
        hash = 47 * hash + this.orderNumber;
        hash = 47 * hash + Objects.hashCode(this.customerName);
        hash = 47 * hash + Objects.hashCode(this.area);
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
        final Order other = (Order) obj;
        if (this.orderNumber != other.orderNumber) {
            return false;
        }
        if (!Objects.equals(this.customerName, other.customerName)) {
            return false;
        }
        if (!Objects.equals(this.dateOfOrder, other.dateOfOrder)) {
            return false;
        }
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Order{" + "dateOfOrder=" + dateOfOrder + ", orderNumber=" + orderNumber + ", customerName=" + customerName + ", area=" + area + '}';
    }
    
    
}




