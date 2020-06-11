
package com.tenzin.interestcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * Apr 30, 2020
 */
public class Calculate {
    
    public static void calculateInterest(){
        
        Scanner sc = new Scanner(System.in);
        
         String initialAmount, time, rate;
         
        System.out.println("How much do you want to invest? ");
        initialAmount = sc.nextLine();
        BigDecimal ia  = new BigDecimal(initialAmount);
        System.out.println("How many years are you investing? ");
        //int time = Integer.parseInt(sc.nextLine());
        time = sc.nextLine();
        BigDecimal t = new BigDecimal(time);
        System.out.println("What is the annual interest rate % growth? ");
        //float rate = Integer.parseInt(sc.nextLine());
        rate = sc.nextLine();
        BigDecimal r = new BigDecimal(rate);
        BigDecimal one = new BigDecimal("1");
        BigDecimal four = new BigDecimal("4");
        BigDecimal hundo = new BigDecimal("100");
        
        System.out.println("\nCalculating...");
        
        BigDecimal newAmount = ia;
       // String newAmountString = String.valueOf(newAmount);
        //newAmount = initialAmount;
        
        BigDecimal beginning ;
        BigDecimal ending = new BigDecimal("0");
        for (int i = 1; i<=t.intValue(); i++) {
            beginning = newAmount;
            for (int j = 0; j < 4 ; j++) {
                //1,4,100 should be big decimal
                //newAmount = newAmount * (1 + (rate / 4) / 100);
                
                newAmount = newAmount.multiply(one.add(r.divide(four,2, RoundingMode.HALF_UP)).divide(hundo, 2, RoundingMode.HALF_UP));
                
                //newAmount.equals(newAmount.multiply(one.add(r.divide(four, 6, RoundingMode.HALF_UP)).divide(hundo,6,RoundingMode.HALF_UP)));
   
                
            }
            ending = newAmount;
            BigDecimal interest = beginning.subtract(ending);
            //NumberFormat format = NumberFormat.getCurrencyInstance();
            
            System.out.println("year " + i + ":");
            System.out.println("Began with " + beginning.setScale(2, RoundingMode.HALF_UP));
            System.out.println("Earned " + interest.setScale(2, RoundingMode.HALF_UP));
            System.out.println("Ended with " + ending.setScale(2, RoundingMode.HALF_UP) + ". \n");
        }
    }

}
