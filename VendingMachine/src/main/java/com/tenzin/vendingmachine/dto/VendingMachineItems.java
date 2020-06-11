package com.tenzin.vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineItems {

    String itemName;
    BigDecimal itemCost;
    int numOfItems;

    public VendingMachineItems(String itemName, BigDecimal itemCost, int numOfItems) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.numOfItems = numOfItems;
    }

    public VendingMachineItems(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

}
