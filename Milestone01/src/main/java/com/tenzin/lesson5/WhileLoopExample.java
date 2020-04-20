
package com.tenzin.lesson5;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel
 * @date 16th April 2020
 */
public class WhileLoopExample {
    
    public static void main(String[] args) {
        
        int i = 1;
        
        while(i < 6){
            System.out.println(i);
            i++;
        }
        System.out.println("***Generating random number***");
        Random rGen = new Random();
        int randomNum = rGen.nextInt(10) + 1;
        
        while(randomNum < 8){
            System.out.println(randomNum);
            randomNum = rGen.nextInt(10) + 1;
        }
    }
    
}
