package com.tenzin.vendingmachine;

import com.tenzin.vendingmachine.controller.VendingMachineController;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class App {

    public static void main(String[] args) {

        VendingMachineController controller = new VendingMachineController();
        controller.run();

    }

}
