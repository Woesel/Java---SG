package com.tenzin.ordertest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tenzin Woesel Jul 8, 2020
 */
public class Something {

    public static void main(String[] args) {

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

        Scanner input = new Scanner(System.in);
//        String charDigitOnly;
//        do {
//            System.out.print("Enter a string [A-Z, 0-9, commas, and periods] only: ");
//            charDigitOnly = input.nextLine();
//        } while (!charDigitOnly.matches("[a-zA-Z0-9\\,\\.\\s]*"));
//        //[] is a set of characters, * means as 0 or many times.
//        //a-z is all lowercase letters
//        //A-Z is all uppercase letters
//        //0-9 is all numbers
//        //\\, is the comma
//        //\\. is the period
//        //\\s is all whitespace
//        System.out.println(charDigitOnly + " - String accepted");
        System.out.println("Please enter a name");
        String name = input.nextLine();
        boolean match = Pattern.matches("[a-zA-Z0-9,.]*", name);
        System.out.println(match);
        //  Pattern p = Pattern.compile("^[a-zA-Z0-9]$");
//        Matcher m = p.matcher("^[a-zA-Z0-9");
        //  Matcher m = p.matcher(name);
//        if (!m.matches()) {
//            System.out.println("Wrong");
//        }
    }

}
