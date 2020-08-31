package com.tenzin.ordertest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Jul 17, 2020
 */
public class FileFolderExperiments {

    public static void main(String[] args) throws IOException {
        
        LocalDate date0 = LocalDate.now().plusDays(1);
        LocalDate date1 = LocalDate.now().plusDays(2);
        LocalDate date2 = LocalDate.now().plusDays(3);

        Order order0 = new Order(date0, 0, "Apple", BigDecimal.ONE);
        Order order1 = new Order(date1, 1, "Banana", BigDecimal.TEN);
        Order order2 = new Order(date2, 2, "Cranberry", BigDecimal.TEN.add(BigDecimal.ONE));
        Order order3 = new Order(date2, 3, "Dried Fruit", BigDecimal.TEN.add(BigDecimal.ONE));
        Order order4 = new Order(date2, 4, "Elderberry", BigDecimal.TEN.add(BigDecimal.ONE));

        Map<Integer, Order> littleMap0 = new HashMap<>();
        littleMap0.put(order0.getOrderNumber(), order0);

        Map<Integer, Order> littleMap1 = new HashMap<>();
        littleMap1.put(order1.getOrderNumber(), order1);

        Map<Integer, Order> littleMap2 = new HashMap<>();
        littleMap2.put(order2.getOrderNumber(), order2);
        littleMap2.put(order3.getOrderNumber(), order3);
//        littleMap2.put(order4.getOrderNumber(), order4);

        Map<LocalDate, Map<Integer, Order>> allOrdersByDateAndNumber = new HashMap<>();

        allOrdersByDateAndNumber.put(date0, littleMap0);
        allOrdersByDateAndNumber.put(date1, littleMap1);
        allOrdersByDateAndNumber.put(date2, littleMap2);

        Order theOrder = allOrdersByDateAndNumber.get(date2).get(3);
        Order theOtherOrder = allOrdersByDateAndNumber.get(date2).get(4);
        System.out.println("This is the order you are looking for: " + theOrder);
        System.out.println("New One below");
        System.out.println("This is the order you are looking for: " + theOtherOrder);
        
        Map<Integer, Order> miniMap = allOrdersByDateAndNumber.get(date2);
        System.out.println("");
        System.out.println("");
        System.out.println(miniMap);
        
        
        miniMap.put(order4.getOrderNumber(), order4);
        System.out.println("");
        System.out.println("");
        System.out.println(miniMap);
        
        allOrdersByDateAndNumber.put(date2, miniMap);

        File f = new File("Orders\\");
        File[] listFiles = f.listFiles();
        String[] s = f.list();
        String date;

        for (File file : listFiles) {//object type is a file

            date = file.getName().substring(7, 15);
            System.out.println(date);
            String path = file.getPath();
            System.out.println(path);
            Scanner scanner;
            
            scanner = new Scanner(new BufferedReader(new FileReader(file)));
            
            String currentLine;
            scanner.nextLine(); //this skips the first line(header)
            Order currentOrder;

            while (scanner.hasNextLine()) {
                currentLine = scanner.nextLine();
                Map<Integer, Order> insideMap = allOrdersByDateAndNumber.get(currentOrder.getOrderDate());
                allOrdersByDateAndNumber.put(currentOrder.getDateOfOrder(), insideMap);
            }

        }
        }

//        for (int i = 0; i < s.length; i++) {//for a string array //just a string, not a whole file
//            String string = s[i]; //assign the string from the list to another string
//            date = string.substring(7, 15);//make a string called date and only put part of the "string" String
//            System.out.println(date);
//            //need to work with the whole file here...
//            String path = s.getPath();
//            System.out.println(path);
//        }
        
   

    }

}
