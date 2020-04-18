
package com.tenzin.exercise5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * April 18, 2020
 */
public class HighRoller {
    
    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        Scanner sc = new Scanner(System.in);
        
        int sides;
        
        System.out.println("TIME TO ROLLLLLLL THE DICE!");
        System.out.print("Please tell the number of sides a sigle die has :");
        sides = sc.nextInt();
        
        int rollResult = diceRoller.nextInt(sides) + 1 ;
        
        System.out.println("I rolled a " + rollResult);
        
        if(rollResult == 1){
            
            System.out.println("You rolled a critical failure! Ouch.");
        }if(rollResult == sides){
            System.out.println("You rolled a critical! Nice job!");
        }
        
    }
    
}
