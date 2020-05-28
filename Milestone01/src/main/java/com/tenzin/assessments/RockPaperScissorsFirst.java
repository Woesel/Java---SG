package com.tenzin.assessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 24, 2020
 */
public class RockPaperScissorsFirst {
    
    public static void printResult(){
        
    }

    public static void main(String[] args) {

        int userRound, userChoice, compChoice;
        String playAgain;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.print("How many rounds do you want to play? ");
            userRound = Integer.parseInt(sc.nextLine());

            int userScore = 0, compScore = 0, tieScore = 0;

            if (userRound <= 0 || userRound > 10) {
                System.out.println("Not a valid choice.");  // checks if the user enters number between 1-10 rounds.
                System.exit(0);
            } else {
                for (int i = 1; i <= userRound; i++) {

                    boolean choice = false;

                    System.out.println("Round " + i + " :");

                    do {
                        System.out.print("Please choose 1 for Rock, 2 for Paper & 3 for Scissors : ");
                        userChoice = Integer.parseInt(sc.nextLine());
                        if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                            choice = true;
                        } else {
                            System.out.println("Invalid choice.");
                            choice = false;
                        }
                    } while (!choice);
                    //System.out.println(compChoice);

                    switch (userChoice) {
                        case 1:
                            System.out.println("\nYou chose Rock.");
                            break;
                        case 2:
                            System.out.println("\nYou chose Paper.");
                            break;
                        case 3:
                            System.out.println("\nYou chose Scissors.");
                            break;
                        default:
                            break;
                    }
                        
                    compChoice = rand.nextInt(3) + 1; //computer chooses a random number between 1 -3
                    //System.out.println(compChoice);

                    if (userChoice == compChoice) {

                        System.out.println("Computer chose the same.");
                        System.out.println("\nIt's a tie.");
                        tieScore++;
                        System.out.println("\nYour score : " + userScore);
                        System.out.println("Computer score : " + compScore);
                        System.out.println("Tie : " + tieScore + "\n");
                    }

                    switch (userChoice) {

                        case 1:
                            //user chose rock

                            if (compChoice == 3) {

                                System.out.println("Computer chose Scissors.");
                                System.out.println("\nRock breaks Scissors, you won.");
                                userScore++;
                                System.out.println("\nYour score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            } else if (compChoice == 2) {

                                System.out.println("Computer chose Paper.");
                                System.out.println("\nPaper wraps rock, computer wins this time.");
                                compScore++;
                                System.out.println("\nYour score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            } // end of rock if statement
                            break;

                        case 2:
                            //user chose paper
                            if (compChoice == 3) {

                                System.out.println("Computer chose Scissors.");
                                System.out.println("\nScissors cuts paper, computer wins.");
                                compScore++;
                                System.out.println("\nYour score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            } else if (compChoice == 1) {

                                System.out.println("Computer chose Rock.");
                                System.out.println("\nPaper wraps rock, you win.");
                                userScore++;
                                System.out.println("\nYour score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            }   //end of paper if statement
                            break;

                        case 3:
                            //user chose scissors
                            if (compChoice == 2) {

                                System.out.println("Computer chose paper.");
                                System.out.println("\nScissors cuts paper. You win.");
                                userScore++;
                                System.out.println("\nYour score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            } else if (compChoice == 1) {

                                System.out.println("Computer chose rock.");
                                System.out.println("\nRock breaks scissors. Computer wins.");
                                compScore++;
                                System.out.println("Your score : " + userScore);
                                System.out.println("Computer score : " + compScore);
                                System.out.println("Tie : " + tieScore + "\n");

                            }
                    }//end of scissors if statement
                }

                if (userScore > compScore) {

                    System.out.println("You won more rounds than the computer. Congrats!!!");

                } else if (compScore > userScore) {

                    System.out.println("The computer won more rounds than you. Better luck next time.");

                } else if (compScore == userScore) {

                    System.out.println("It's a tie game. GGs.");
                }
                System.out.println("The final score is : ");
                System.out.println("Your score : " + userScore);
                System.out.println("Computer score : " + compScore);
                System.out.println("Tie : " + tieScore + "\n");

            }
            System.out.println("Do you want to play again? (y/n)");
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equalsIgnoreCase("y"));          // using do-while to loop through the code again.

        System.out.println("\nThanks for playing!");
    }

}
