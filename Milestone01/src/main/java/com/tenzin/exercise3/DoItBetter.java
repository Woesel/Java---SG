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
 */
public class DoItBetter {
    
    public static void main(String[] args) {
        
        int miles,hotDogs,languages;
        int myMiles,myHotDogs,myLanguage;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many miles can you run? ");
        miles = userInput.nextInt();
        userInput.nextLine();
        
        myMiles = miles * 2 + 1;
        
        System.out.println("Nice, but you know what I can run " + myMiles + " miles." );
        
        System.out.println("\nHow many hot dogs can you chomp down? ");
        hotDogs = userInput.nextInt();
        userInput.nextLine();
        
        myHotDogs = hotDogs * 2 +1;
        
        System.out.println("I can chomp down " + myHotDogs + " hotdogs.");
        
        System.out.println("\nHow many languages do you know? ");
        languages = userInput.nextInt();
        userInput.nextLine();
        
        myLanguage = languages * 2 + 1;
        
        System.out.println("Haha! I am better than you. I know " + myLanguage + " languages.");
    }

}
