package com.tenzin.exercise4;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * @date April 16,2020
 */
public class YourLifeInMovies {

    public static void main(String[] args) {

        int birthYear;

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hey, let's play a game! What's your name? ");
        name = sc.nextLine();

        System.out.print("\nOk, " + name + ", when were you born? ");
        birthYear = Integer.parseInt(sc.nextLine());
        
        System.out.println("Well " + name + "...");

        if (birthYear < 2005) {

            System.out.println("Did you realise that Pixar's 'UP' came out over a decade ago.");
        }
        if(birthYear < 1995){
            System.out.println("Did you know that the first Harry Potter came out over 15 years ago.");
        }
        if(birthYear < 1985){
            System.out.println("Did you realize that Space Jam came not last decade, but the one before THAT.");
        }
        if(birthYear < 1975){
            System.out.println("The original Jurrassic Park release is closer to the first lunar landing than it is to today.");
        }
        if(birthYear <= 1965){
            System.out.println("Did you realize that the MASH TV series has been around for almost half a century");
        }
        if(birthYear < 1965 || birthYear > 2005){ 
            System.out.println("You are born in a special time zone. My memory needs to be updated with new movies.");
        }
    }

}
