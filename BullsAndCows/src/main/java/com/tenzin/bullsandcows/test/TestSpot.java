package com.tenzin.bullsandcows.test;

/**
 *
 * @author Tenzin Woesel Aug 28, 2020
 */
public class TestSpot {

    public static void main(String[] args) {
        String userGuess = "9834";
        String answer = "9834";

        if (userGuess.equals(answer)) {
            System.out.println("e:4:p:0");
        } else {
            int eCounter = 0;
            int pCounter = 0;
            for (int i = 0; i < answer.length(); i++) {
                //if the first digit of the answer is the 
                //same as the first digit of the guess
                //then that means exact matches = 1

                if (userGuess.charAt(i) == answer.charAt(i)) {
                    eCounter++;
                } else if (userGuess.contains(answer.substring(i, i + 1))) {
                    pCounter++;
                }
                System.out.println("UserGuess " + i + " " + answer.substring(i, i + 1));
            }
            System.out.println(eCounter);
            System.out.println(pCounter);

        }
    }

}
