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
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        String nounOne, nounTwo;
        String adjectiveOne, adjectiveTwo;
        String pluralNounOne, pluralNounTwo, pluralNounThree;
        
        int number;
        
        String verbOne, verbTwo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        
        System.out.print("\nI need a noun : ");
        nounOne = sc.nextLine(); // 1
        
        System.out.print("Now an adjective : ");
        adjectiveOne = sc.nextLine(); //2
        
        System.out.print("Another noun: ");
        nounTwo = sc.nextLine(); //3
        
        System.out.print("Add a number : ");
        number = sc.nextInt(); //4
        sc.nextLine();
        
        System.out.print("Another adjective : ");
        adjectiveTwo = sc.nextLine(); //5
        
        System.out.print("A plural noun : ");
        pluralNounOne = sc.nextLine(); //6
        
        System.out.print("Another one : ");
        pluralNounTwo = sc.nextLine(); //7
        
        System.out.print("One more : ");
        pluralNounThree = sc.nextLine(); //8
        
        System.out.print("A verb (infinite form) : ");
        verbOne = sc.nextLine(); //9
        
        System.out.print("Same verb (past participle) : ");
        verbTwo = sc.nextLine(); //10
        
        System.out.println("\n***NOW LETS GET MAD (libs) ***");
        System.out.println(nounOne + ": the " + adjectiveOne + " frontier. These are the voyages of the starship "+ nounTwo + ". Its " + number + "-year mission: to explore strange " + adjectiveTwo + " " + pluralNounOne + ", to seek out " + adjectiveTwo + " " + pluralNounTwo + "and" + adjectiveTwo + " " + pluralNounThree + ", to boldly " + verbOne + " where no one has " + verbTwo + " before.");
        
    }
    
}
