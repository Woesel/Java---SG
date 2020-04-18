
package com.tenzin.exercise5;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel
 * April 18, 2020
 */
public class ALittleChaos {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " +randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        int num2 = (int) Math.floor(Math.random() * 10);  //Yes we can include Math statement for random numbers, this will return a random number between 0 - 9
        double num3 = randomizer.nextInt(100);
        
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " +num +", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0-100: ");
        
        System.out.print(randomizer.nextInt(51)+50 + ", "); // This adds 50 to the random number generated between 0-51
        System.out.print(randomizer.nextInt(101) +70 + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        System.out.println(num2);
        System.out.println(num3);
    }
    
}
