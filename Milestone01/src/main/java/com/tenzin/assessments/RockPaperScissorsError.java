package com.tenzin.assessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 24, 2020
 */
public class RockPaperScissorsError {

    /**
     *
     * @param userScore
     * @param compScore
     * @param tieScore
     */
    /* public static void printResult(int userScore, int compScore, int tieScore) {
        System.out.println("\nYour score : " + userScore);
        System.out.println("Computer score : " + compScore);
        System.out.println("Tie : " + tieScore + "\n");
        //TODO method for results
    }//end of print result method   */
    public static void showChoice() {
        System.out.println("Please choose \n1 = Rock, \n2 = Paper \n3 = Scissors ");

    }

    public static int getUserChoice(Scanner userChoice) {
        int userChoice1;
        System.out.println("Please choose a number form 1-3");
        userChoice1 = Integer.parseInt(userChoice.nextLine());

        showChoice();

        return userChoice1;
    }

    /* public static int getUserInput(Scanner sc){
        
        showChoice();
        System.out.println("");
        
        return 1;
    } */
    public static void whoWon(int compChoice, int userChoice) {

        if ((userChoice == 1) || (userChoice == 2) || (userChoice == 3))
        {
            if (compChoice == 2 || compChoice ==3) {
                System.out.println("userwon");
            }
        }
       

    }

    public static void main(String[] args) {

        int userRound, compChoice;
        String playAgain;

        Scanner userChoice1 = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.print("How many rounds do you want to play? ");
            userRound = Integer.parseInt(userChoice1.nextLine());

            int userScore = 0, compScore = 0, tieScore = 0;

            if (userRound <= 0 || userRound > 10) {
                System.out.println("Not a valid choice.");  // checks if the user enters number between 1-10 rounds.
                System.exit(0);
            } else {
                for (int i = 1; i <= userRound; i++) {

                    getUserChoice(userChoice1);
                    System.out.println(userChoice1);
                    if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                        choice = true;
                    } else {
                        System.out.println("Invalid choice.");
                        choice = false;
                    }

                    System.out.println("Round " + i + " :");

//System.out.println(compChoice);
                    compChoice = rand.nextInt(3) + 1; //computer chooses a random number between 1 -3
                    //System.out.println(compChoice);

                    if (userChoice1 == compChoice) {

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
                            //TODO method for result

                        } else if (compChoice == 1) {

                            System.out.println("Computer chose Rock.");
                            System.out.println("\nPaper wraps rock, you win.");
                            userScore++;
                            //TODO method for result

                        }
                    }//end of paper if statement
                    if (userChoice == 3) { //user chose scissors
                        if (compChoice == 2) {

                            System.out.println("Computer chose paper.");
                            System.out.println("\nScissors cuts paper. You win.");
                            userScore++;
                            //TODO method for result

                        } else if (compChoice == 1) {

                            System.out.println("Computer chose rock.");
                            System.out.println("\nRock breaks scissors. Computer wins.");
                            compScore++;
                            //TODO method for result
                        }
                    } //end of scissor if statement 
                }

                if (userScore > compScore) {

                    System.out.println("You won more rounds than the computer. Congrats!!!");

                } else if (compScore > userScore) {

                    System.out.println("The computer won more rounds than you. Better luck next time.");

                } else if (compScore == userScore) {

                    System.out.println("It's a tie game. GGs.");
                }
                //TODO method for result

            }
            System.out.println("Do you want to play again? (y/n)");
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equalsIgnoreCase("y"));          // using do-while to loop through the code again.

        System.out.println("\nThanks for playing!");
    }

}
