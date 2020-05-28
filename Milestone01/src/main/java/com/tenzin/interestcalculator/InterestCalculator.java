package com.tenzin.interestcalculator;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 23, 2020
 */
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.print("How much do you want to invest? ");
        float initialAmount = Integer.parseInt(sc.nextLine());
        System.out.print("How many years are you investing? ");
        int time = Integer.parseInt(sc.nextLine());
        System.out.print("What is the annual interest rate % growth? ");
        float rate = Integer.parseInt(sc.nextLine());

        System.out.println("\nCalculating...");
        
        float newAmount = initialAmount;
        float beginning ;
        float ending;
        for (int i = 1; i <= time; i++) {
            beginning = newAmount;
            for (int j = 0; j < 4 ; j++) {
                newAmount = newAmount * (1 + (rate / 4) / 100);
            }
            ending = newAmount;
            double interest = ending - beginning;
            NumberFormat format = NumberFormat.getCurrencyInstance();
            System.out.println("year " + i + ":");
            System.out.println("Began with " + format.format(beginning));
            System.out.println("Earned " + format.format(interest));
            System.out.println("Ended with " + format.format(ending) + ". \n");
        }

    }

}
