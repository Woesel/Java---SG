/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise4;

import java.util.Scanner;

/**
 *
 * @author ttibe
 */
public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("Go to the house, or open the mailbox?");

        String action = userInput.nextLine().toLowerCase();

        if (action.equals("open the mailbox")) {

            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");

            action = userInput.nextLine().toLowerCase();

            if (action.equals("look inside")) {

                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So.....so very dark.");
                System.out.println("Run away or keep looking?");

                action = userInput.nextLine().toLowerCase();

                if (action.equals("keep looking")) {

                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");

                } else if (action.equals("run away")) {

                    System.out.println("You ran away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                } 
                }   else if (action.equals("stick your hand in")) {

                    System.out.println("There's a snake inside.");
                    System.out.println("It bit you and you died.");
                }
            
        } 
        else if (action.equals("go to the house")) {
            System.out.println("You went to the house. The house is very dark.");
            System.out.println("look for a flashlight or walk in the dark");
            
        action = userInput.nextLine().toLowerCase();
        if (action.equalsIgnoreCase("look for a flashlight")) {

            System.out.println("You looked for a flashlight and found one.");
            System.out.println("You found an exit sign using the flashlight.");
            System.out.println("You went for the exit and now you are at the starting point again.");
        } else if (action.equalsIgnoreCase("walk in the dark")) {
            System.out.println("You walked and reached a new place.");
            System.out.println("It's an abandoned garage. There's a car and a spaceship.");
            System.out.println("enter the car or enter the spaceship.");
        }
        action = userInput.nextLine().toLowerCase();
        if(action.equals("enter the car")){
            System.out.println("There's a key inside.");
            System.out.println("You started the engine and the car blew up. BOOOM! You were shredded into pieces.");
        }else if(action.equals("enter the spaceship")){
            System.out.println("You entered the spaceship.");
            System.out.println("There's a secret door on the floor. You opened the door and fell into oblivion.");
            System.out.println("And it sent you back to the starting position.");
        }
      }
    }
}
