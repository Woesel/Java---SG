package com.tenzin.exercise5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class GuessMeMore {

    public static void main(String[] args) {

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it.");

        Random rand = new Random();

        int num = rand.nextInt(201) - 100;
        int userNum;
        System.out.println(num);
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i >= 0; i--) {
            
            System.out.print("Please enter the number you've guessed: ");
            userNum = sc.nextInt();
            sc.nextLine();
            
            if (userNum > num) {
                System.out.print("\nHa! Nice try - too high.! Try again.");
                System.out.println("You have " + i + " try left.");
            }
            else if (userNum < num) {
                System.out.println("\nHa! Nice try - too low.! Try again.");
                System.out.println("You have " + i + "  try left");
            }
            else{
                System.out.println("\nWow! Nice guess. That was it.!");
                return;
                }
            }
        
        System.out.println("\nGame Over!!");

        }
    }
