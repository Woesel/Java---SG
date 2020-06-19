package com.tenzin.dvd;

import com.tenzin.dvd.controller.DVDController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Tenzin Woesel May 17, 2020
 */
public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.tenzin.dvd");
        appContext.refresh();
        DVDController controller
                = appContext.getBean("DVDController", DVDController.class);
        controller.run();

    }

}
