package com.tenzin.vendingmachine.controller;

import com.tenzin.vendingmachine.dao.VendingMachinePersistenceException;
import com.tenzin.vendingmachine.dto.VendingMachineItems;
import com.tenzin.vendingmachine.service.VendingMachineDataValidationException;
import com.tenzin.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.tenzin.vendingmachine.service.VendingMachineNoItemInventoryException;
import com.tenzin.vendingmachine.service.VendingMachineService;
import com.tenzin.vendingmachine.ui.UserIO;
import com.tenzin.vendingmachine.ui.UserIOConsoleImpl;
import com.tenzin.vendingmachine.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineController {

    private VendingMachineView view;
    private VendingMachineService service;

    private UserIO io = new UserIOConsoleImpl();

    public VendingMachineController(VendingMachineService service, VendingMachineView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        try {
            while (keepGoing) {
                int menuSelection = 0;

                menuSelection = getMenuSelection();
                switch (menuSelection) {
                    case 1:
//                        io.readBigDecimal("Please enter the dollar amount you have");

                        getAllItems();
                        purchaseItem();

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

        } catch (VendingMachinePersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        } catch (VendingMachineDataValidationException e) {
            view.displayErrorMessage(e.getMessage());
        } catch (VendingMachineInsufficientFundsException e) {
            view.displayErrorMessage(e.getMessage());
        } catch (VendingMachineNoItemInventoryException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    public void insertMoney() {

        view.insertAmount();

    }

    public void getAllItems() throws VendingMachinePersistenceException {
        view.displayItemsAvailableBanner();
        List<VendingMachineItems> allItems = service.getAllItems();
        view.displayItemList(allItems);
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

    private void purchaseItem() throws VendingMachineNoItemInventoryException, VendingMachinePersistenceException, VendingMachineDataValidationException, VendingMachineInsufficientFundsException {

        BigDecimal insertedAmount = view.insertAmount();
        String itemName = view.chooseItemToBuy();

        service.purchasedItem(itemName, insertedAmount);

    }

    public void getSelectedItems() throws VendingMachinePersistenceException {
        view.getSelectedItemBanner();
        String itemName = view.chooseItemToBuy();
        //BigDecimal change = view.
        VendingMachineItems itemBought = service.purchasedItem(itemName, change);

        view.purchaseItem(itemName, change);
    }

}
