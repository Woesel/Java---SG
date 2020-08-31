/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tenzin Woesel
 * @13th Aug, 2020
 */
package com.tenzin.guessnumber;

import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {

        int randomInt = generate();
        int guesses = 0;
        int guessedNum = 0;
        boolean win = false;

        System.out.println("Random Integer: " + randomInt);

        for (guesses = 1; !win; guesses++) {

            guessedNum = userGuess();
            win = didWin(guessedNum, randomInt);

        }
        System.out.println("took you " + guesses);
        
    }

    public static int generate() {

        Random rand = new Random();
        return rand.nextInt(100);

    }

    public static int userGuess() {

        Scanner scan = new Scanner(System.in);
        int guessedNum = scan.nextInt();
        System.out.println("Guess the random number");
        return guessedNum;

    }

    public static boolean didWin(int guessedNum, int randomInt) {

        boolean result = false;

        if (guessedNum > randomInt) {
            System.out.println("Guess a smaller number.");
        } else if (guessedNum < randomInt) {
            System.out.println("Guess a bigger number.");
        } else {
            System.out.println("You guessed the number correctly");
        }
        return true;
                
    }

}
