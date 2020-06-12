package com.tenzin.vendingmachine.ui;

import com.tenzin.vendingmachine.dto.VendingMachineItems;
import com.tenzin.vendingmachine.service.Change;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineView {

    private UserIO io;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Following are the items that you can get from this vending machine.");
        io.print("***************************************");
        io.print("\t\tDairy Milk $2.99");
        io.print("\t\tM&Ms $1.99");
        io.print("\t\t Wai Wai $3.69");
        io.print("\t\t Water $1.89");
        io.print("\t\t KurKure $1.19");
        io.print("***************************************");
        io.print("1. Insert money here to buy an item.");
        io.print("2. Exit");

        return io.readInt("Please enter 1 or 2", 1, 2);
    }

    public BigDecimal insertAmount() {
        BigDecimal insertedAmount = io.readBigDecimal("Please enter the dollar amount for purchasing an item");
        return insertedAmount;
    }

    public String chooseItemToBuy() {
        String itemName = io.readString("Please enter the name of the item you want to buy.");
        return itemName;
    }

    public void displayItemList(List<VendingMachineItems> itemList) {
        io.print("***************************************");
        io.print("Following are the items available to purchase. Please enter the name of the item to buy it.");
        itemList.stream().map((currentItem) -> String.format("%s: %s ", currentItem.getItemName(), currentItem.getItemCost())).forEachOrdered((itemInfo) -> {
            io.print(itemInfo);

        });
        io.print("***************************************");

//        for(VendingMachineItems currentItem : itemList){
//            String itemInfo = String.format("%s : %s", currentItem.getItemName(), currentItem.getItemCost());
//            io.print(itemInfo);
//        }
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void purchaseItem(String itemName, Change change) {

        if (itemName != null) {
            io.print(itemName + "is the item you purchased");
            
        } else {
            io.print("No such items available");
        }
    }

    public void displayItemsAvailableBanner() {
        io.print("======Following are the items available to purchase=====");
    }

    public void getSelectedItemBanner() {
        io.print("You have selected this item to buy.");
    }

}
