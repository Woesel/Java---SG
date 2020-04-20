/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise6;

/**
 *
 * @author ttibe
 */
public class WaitAWhile {
    
    public static void main(String[] args) {
        
        int timeNow = 5;  //if we change this value to 11 , it will only print the statement after while loop.
        int bedTime = 10; // if we change this value to 11, the loop will execute till 11 o'clock
        
        while(timeNow < bedTime) {
            
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiiiiiitle longer....");
            timeNow++;  //If we comment this out, the loop will never end
        }
        System.out.println("Oh. It's " +timeNow + " o'clock. ");
        System.out.println("Guess I should go to bed....");
    }   
    
}
