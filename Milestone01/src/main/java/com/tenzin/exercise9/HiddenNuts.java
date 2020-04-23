
package com.tenzin.exercise9;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel
 * Apr 22, 2020
 */
public class HiddenNuts {
    
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        
        System.out.println("The nut has been hidden ...");

        //Nut finding code should go here.
        for (int i = 0; i < hidingSpots.length; i++) {

            if (hidingSpots[i] == ("Nut")) {
                System.out.println("found it! It's on spot # " + i);

            }
        }

    }

}
