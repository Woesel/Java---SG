/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise3;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * @date April 15th, 2020
 */
public class AllTheTrivia {
    
    public static void main(String[] args) {
        
        String currency,continent,college;
        int eggs, noOfDays;
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many eggs are there in a dozen? ");
        eggs = userInput.nextInt();
        userInput.nextLine();
        
       
        System.out.print("Which continent is closest to the south pole? ");
        continent = userInput.nextLine();
        
        System.out.print("How many days are there in a year? ");
        noOfDays = userInput.nextInt();
        userInput.nextLine();
        
        System.out.print("What is the currency used in India? ");
        currency = userInput.nextLine();
        
        System.out.print("Where is Laguardia Community College located? ");
        college = userInput.nextLine();
        
        
        System.out.println("\nWow! There are " + eggs + " eggs in " + currency);
        System.out.println("I didn't know that " + currency + " is used in " + continent + ".");
        System.out.println(noOfDays + " Antarticans went to " + college + " to collect " +currency);
        
        
    }
    
}
