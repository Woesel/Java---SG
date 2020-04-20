package com.tenzin.exercise6;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class RollerCoaster {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";

        int loopsLooped = 0;
        
        //while (keepRiding.equals("n")) // if we change the condition to no answer it doesn't run through the loop statement

        while (keepRiding.equals("y")) {

            System.out.println("WHEEEEEEEEEeeeeEEEEeeee....!!!");
            System.out.println("Want to keep going? (y/n) : "); // if the user enter neither y nor n it goes through the loop once.
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }

}
