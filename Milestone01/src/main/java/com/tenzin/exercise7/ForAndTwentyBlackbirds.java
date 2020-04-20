
package com.tenzin.exercise7;

/**
 *
 * @author Tenzin Woesel
 * April 19, 2020
 */
public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        
        int birdsInPie = 0;
        for(int i=1;i<24;i++){      //changed the starting point i to 1
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
 