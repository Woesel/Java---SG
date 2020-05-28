
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class RockPaperScissors {

    public static void main(String[] args) {    
        Scanner myScanner = new Scanner(System.in);

        do {
            int userRounds, userAnswer, winCounter = 0, loseCounter = 0, tieCounter = 0, i;
            String result, replay;
            System.out.println("Okay! Time to play Rock, Paper, Scissors!!");
            System.out.println("How many rounds would you like to play?(1-10 rounds)");
            userRounds = myScanner.nextInt();

            if (userRounds <= 10 && userRounds > 0) {

                System.out.println("Great! We're playing " + userRounds + " rounds.");

                for (i = 0; i < userRounds; i++) {

                    System.out.println("Okay, what would you like to throw? Rock(1), Paper(2), Scissors(3)");
                    userAnswer = myScanner.nextInt();

                    result = throwResults(userAnswer);
                    System.out.println(result);

                    if (result.equals("You lost!")) {
                        loseCounter++;

                    } else if (result.equals("You won!")) {
                        winCounter++;

                    } else {
                        tieCounter++;

                    }

                }
                if (winCounter > loseCounter) {
                    System.out.println("Congrats! You won!!");
                    System.out.println("Scoreboard: You had " + winCounter + " wins vs. " + loseCounter + " computer wins and " + tieCounter + " ties!!");
                } else {
                    System.out.println("#sadlife. You lost to an inanimate object.");
                    System.out.println("Scoreboard:  You had " + winCounter + " wins vs. " + loseCounter + " computer wins vs. " + tieCounter + " ties lmao");
                }
                myScanner.nextLine();//Is needed to force computer to wait for next input, if not, the Scanner error occurs
                System.out.println("Would you like to play again? (y/n)");
                replay = myScanner.nextLine();
                if (replay.equals("n")) {
                    System.out.println("Thanks for playing!!");
                    System.exit(0);
                }

            } else {
                System.out.println("Error: Please choose a number between 1-10!");
                System.exit(0); //will exit
            }
        } while (true); //will begin program again

    }


    /**
     *
     * @param userAnswer
     * @return
     */
    public static String throwResults(int userAnswer) {

        Random rando = new Random();

        int computerA;

        computerA = rando.nextInt(4-1) + 1;
        System.out.println(computerA);

        if (computerA == userAnswer) {
            return "It'a a tie!";
        } else if (userAnswer == 1 && computerA == 3) {
            return "You won!";
        } else if (userAnswer == 2 && computerA == 3) {
            return "You lost!";
        } else if (userAnswer == 1 && computerA == 2) {
            return "You lost!";
        } else if (userAnswer == 3 && computerA == 2) {
            return "You won!";
        } else if (userAnswer == 2 && computerA == 1) {
            return "You won!";
        } else {
            return "You lost!";
        }

    }

}

