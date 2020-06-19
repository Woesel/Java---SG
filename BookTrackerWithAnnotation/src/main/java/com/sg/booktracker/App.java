package com.sg.booktracker;

import com.sg.booktracker.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Kyle David Rudy
 */
public class App {

    public static void main(String[] args) {
//        ApplicationContext appContext
//                = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//
//        BookController controller = appContext.getBean("controller", BookController.class);
//        controller.run();
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.scan("com.sg.booktracker");
        act.refresh();

        BookController controller = act.getBean("bookController", BookController.class);
        controller.run();
    }
}
