/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise3;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class PassingTheTuringTest {

    public static void main(String[] args) {

        String name, color, favFood;
        int favNumber, myNum = -7, coolNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What is your name? ");
        name = sc.nextLine();

        System.out.println("\nHi " + name + "! I'm Tenzin.");
        System.out.print("What is your favorite color? ");
        color = sc.nextLine();

        System.out.println("\nHuh, " + color + "? Mine's Silver Grey.");
        System.out.println("My favorite food is Dumplings. I love to eat them.");
        System.out.print("\nWhat's your favorite food, " + name + "? ");
        favFood = sc.nextLine();

        System.out.println("\nReally? " + favFood + "? That's awesome!");
        System.out.print("Speaking of favorites, what's your favourite number? ");
        favNumber = sc.nextInt();

        System.out.println("\n" + favNumber + "is a cool number. Mine's " + myNum + ".");
        coolNum = favNumber * myNum;
        System.out.println("Did you know that " + favNumber + " * " + myNum + " is " + coolNum + "? That's a cool number too!");

        System.out.println("\nWell, thanks for talking to me, " + name + "!");
        System.out.println("Bye, I have to go to Mars now.");

    }

}
