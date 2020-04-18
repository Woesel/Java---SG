package com.tenzin.exercise4;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 17, 2020
 */
public class TriviaNight {

    public static void main(String[] args) {

        int counter = 0;
        int ans1, ans2, ans3;

        Scanner sc = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT!!! Are you ready?!");
        System.out.println("\nFIRST QUESTION!");
        System.out.println("In which year did Tibet lost it's independence?");
        System.out.println("1) 1989 \t 2) 1949 \n 3) 1959 \t 4) 1960");
        ans1 = sc.nextInt();
        if (ans1 == 3) {

            System.out.println("You answered " + ans1);
            counter++;
            System.out.println("Your answer is correct. Your score is " + counter + ". You have two more questions left.");

        } else {

            System.out.println("You answered wrong. The answer is 3) 1959. Your score is " + counter + ". You have two more questions left.");

        }

        System.out.println("\nSECOND QUESTION!");
        System.out.println("What is the capital city of India?");
        System.out.println("1) Delhi \t 2) New Delhi \n 3) New York \t 4) Jharkhand");
        ans2 = sc.nextInt();
        if (ans2 == 2) {

            System.out.println("You answered " + ans2);
            counter++;
            System.out.println("Your answer is correct. Your score is " + counter + ". You have one more questions left.");

        } else {

            System.out.println("You answered wrong. The answere is 2) New Delhi. Your score is " + counter + ". You have one more question left.");
        }

        System.out.println("\nTHIRD QUESTION!");
        System.out.println("Who won the title of 2019 NBA Champions?");
        System.out.println("1)Toronto Raptors \t 2) Golden State Warriors \n 3) Houston Rockets \t 4) Cleveland Cavaliers");
        ans3 = sc.nextInt();
        if (ans3 == 1) {

            System.out.println("You answered " + ans3);
            counter++;
            System.out.println("Your answer is correct. Your score is " + counter + ".");

        } else {

            System.out.println("You answered wrong. The answer is 1) Toronto Raptors. Your score is " + counter + ".");
        }
        if (counter < 2) {

            System.out.println("You suck at General Question. You need to read more books.");
        }else{
            System.out.println("Awesome. Good Job!!!");
        }
    }
}
