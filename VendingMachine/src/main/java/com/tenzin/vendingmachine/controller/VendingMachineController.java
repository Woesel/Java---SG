package com.tenzin.vendingmachine.controller;

import com.tenzin.vendingmachine.ui.UserIO;
import com.tenzin.vendingmachine.ui.UserIOConsoleImpl;
import com.tenzin.vendingmachine.ui.VendingMachineView;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineController {

    private VendingMachineView view = new VendingMachineView();
    private UserIO io = new UserIOConsoleImpl();

    public void run() {
        boolean keepGoing = true;
        while (keepGoing) {
            int menuSelection = 0;

            menuSelection = getMenuSelection();
            switch (menuSelection) {
                case 1:
                    io.print("Please specify the dollar amount");
//                    purchase();
                    break;
                case 2:
                    keepGoing = false;
                    break;
                default:
                    io.print("Unknown Command");
            }

        }
        io.print("Good Bye");

    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

//    private void purchase(){
//    BigDecimal insertedAmount = view.insertAmount();
//    String itemName = view.getItemName();
//    service.purchaseItem(itemName, insertedAmount);
//    getting item - dao.getItem(itemName)--> wholeItem(name, price, quantity)
//    itemCost = item.getPrice(), compare to the money the user put in
//    ifmoneyis okay, then allow purchase, 
//    if money is not enough, don't allow purchase, throw error
//    }
    private void getAllItems() {

    }

}
