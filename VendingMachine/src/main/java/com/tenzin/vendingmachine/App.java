package com.tenzin.vendingmachine;

import com.tenzin.vendingmachine.controller.VendingMachineController;
import com.tenzin.vendingmachine.dao.VendingMachineAuditDao;
import com.tenzin.vendingmachine.dao.VendingMachineAuditDaoFileImpl;
import com.tenzin.vendingmachine.dao.VendingMachineDao;
import com.tenzin.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.tenzin.vendingmachine.service.VendingMachineService;
import com.tenzin.vendingmachine.service.VendingMachineServiceImpl;
import com.tenzin.vendingmachine.ui.UserIO;
import com.tenzin.vendingmachine.ui.UserIOConsoleImpl;
import com.tenzin.vendingmachine.ui.VendingMachineView;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class App {

    public static void main(String[] args) {

        UserIO myIo = new UserIOConsoleImpl();

        VendingMachineView myView = new VendingMachineView(myIo);

        VendingMachineDao myDao = new VendingMachineDaoFileImpl();

        VendingMachineAuditDao myAuditDao = new VendingMachineAuditDaoFileImpl();

        VendingMachineService myService = new VendingMachineServiceImpl(myDao, myAuditDao);

        VendingMachineController controller = new VendingMachineController(myService, myView);

        controller.run();

    }

}
