package com.tenzin.luckyseven;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 23, 2020
 */
public class LuckySevens {

    public static int rollDice() {

        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return die1 + die2;

    }

    public static void main(String[] args) {

        int startingBet, rollCount, maxAmount, countAtMax;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many dollars do you have? $");
        startingBet = sc.nextInt();

        maxAmount = startingBet;
        countAtMax = 0;
        rollCount = 0;

        while (startingBet > 0) {
            rollCount++;

            if (rollDice() == 7) {
                startingBet += 4;
            } else {
                startingBet--;
            }

            if (startingBet > maxAmount) {
                maxAmount = startingBet;
                countAtMax = rollCount;
            }
        }
        System.out.println("You are broke after " + rollCount + " rolls.");
        System.out.println("You should have quit after " + countAtMax + " rolls when you had $" + maxAmount + ".");

    }

}
