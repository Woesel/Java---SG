/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise6;

/**
 *
 * @author Tenzin Woesel April 18, 2020
 */
public class LovesMe {

    public static void main(String[] args) {

        int petals = 34;  //I used while loops since the condition will run the loop

        System.out.println("Well here goes nothing...");
        boolean lovesMe = true;

        while(petals > 0) {
            if (lovesMe) {
                System.out.println("It loves me NOT!");
                petals--;
                lovesMe = false;
                
            } else {
                System.out.println("It LOVES me!");
                petals--;
                lovesMe = true;
            }
        } 
        if(lovesMe){
            
                System.out.println("I knew it! It LOVES ME!");
        }else{
            System.out.println("It doesnt.");
        }

    }

}
