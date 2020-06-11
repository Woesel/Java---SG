package com.tenzin.vendingmachine.ui;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineView {

    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Following are the items that you can get from this vending machine.");
        io.print(" Dairy Milk $2.99");
        io.print(" M&Ms $1.99");
        io.print(" Wai Wai $3.69");
        io.print(" Water $1.89");
        io.print(" KurKure $1.19");
        io.print("1. Insert your money here to buy something.");
        io.print("2. Exit");

        return io.readInt("Please select from the above choice", 1, 2);
    }
    
    

}
