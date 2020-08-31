package com.tenzin.vendingmachine;

import com.tenzin.vendingmachine.controller.VendingMachineController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class App {

    public static void main(String[] args) {
        
        ApplicationContext myContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller
                = myContext.getBean("controller", VendingMachineController.class);
        controller.run();

    }

}
