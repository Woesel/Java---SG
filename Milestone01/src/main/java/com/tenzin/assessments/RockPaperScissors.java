package com.tenzin.assessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 26, 2020
 */
public class RockPaperScissors {

    public static int showChoice() {  

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rounds do you want to play? ");
        int userRound = sc.nextInt();

        if (userRound <= 0 || userRound > 10) {
            System.out.println("Not a valid choice.");  // checks if the user enters number between 1-10 rounds.
            System.exit(0);
        }
        return userRound;

    }

    public static int getUserChoice() {     // This is for getting the user choose between rock, paper and scissors.

        Scanner sc = new Scanner(System.in);

        System.out.print("Please choose 1 for Rock, 2 for Paper & 3 for Scissors : ");
        int userChoice = Integer.parseInt(sc.nextLine());
        if (userChoice == 1) {
            System.out.println("\nYou chose Rock.");
        } else if (userChoice == 2) {
            System.out.println("\nYou chose Paper");
        } else if (userChoice == 3) {
            System.out.println("\nYou chose Scissors.");
        }

        return userChoice;
    }


    public static void main(String[] args) {

        int compChoice;
        String playAgain;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            int userRound = showChoice();
            int tieScore = 0, userScore = 0, compScore = 0;

            for (int i = 1; i <= userRound; i++) {
                boolean choice = false;

                System.out.println("\nRound " + i + " :");
                int userChoice = getUserChoice();

                do {

                    if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                        choice = true;
                    } else {
                        System.out.println("Invalid choice.");
                        userChoice = getUserChoice();
                        choice = false;

                    }
                } while (!choice);

                compChoice = rand.nextInt(3) + 1; //computer chooses a random number between 1-3
//                System.out.println(compChoice);

                if (userChoice == compChoice) {

                    System.out.println("Computer chose the same.");
                    System.out.println("\nIt's a tie.");
                    tieScore++;

                }
                if (userChoice == 1) { //user chose rock                           

                    if (compChoice == 3) {

                        System.out.println("Computer chose Scissors.");
                        System.out.println("\nRock breaks Scissors, you won.");
                        userScore++;
                        //TODO method for result

                    } else if (compChoice == 2) {

                        System.out.println("Computer chose Paper.");
                        System.out.println("\nPaper wraps rock, computer wins this time.");
                        compScore++;
                        //TODO method for result

                    }
                } //end of rock if statement

                if (userChoice == 2) {//user chose paper
                    if (compChoice == 3) {

                        System.out.println("Computer chose Scissors.");
                        System.out.println("\nScissors cuts paper, computer wins.");
                        compScore++;

                    } else if (compChoice == 1) {

                        System.out.println("Computer chose Rock.");
                        System.out.println("\nPaper wraps rock, you win.");
                        userScore++;

                    }
                }//end of paper if statement
                if (userChoice == 3) { //user chose scissors
                    if (compChoice == 2) {

                        System.out.println("Computer chose paper.");
                        System.out.println("\nScissors cuts paper. You win.");
                        userScore++;

                    } else if (compChoice == 1) {

                        System.out.println("Computer chose rock.");
                        System.out.println("\nRock breaks scissors. Computer wins.");
                        compScore++;

                    }
                } //end of scissor if statement 

            }
            if (userScore > compScore) {

                System.out.println("\nYou won more rounds than the computer. Congrats!!!");

            } else if (compScore > userScore) {

                System.out.println("\nThe computer won more rounds than you. Better luck next time.");

            } else if (compScore == userScore) {

                System.out.println("\nIt's a tie game. GGs.");
            }

            System.out.println("\nThe final score is : ");
            System.out.println("Your score : " + userScore);
            System.out.println("Computer score : " + compScore);
            System.out.println("Tie : " + tieScore + "\n");
            System.out.println("Do you want to play again? (y/n)");
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("y"));
        System.out.println("\nThanks for playing! See you next time.");
    }

}
