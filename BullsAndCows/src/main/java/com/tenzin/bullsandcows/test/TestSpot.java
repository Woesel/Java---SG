package com.tenzin.bullsandcows.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
        Random rm = new Random();

        Set<Integer> answer1 = new HashSet<>(); //generating random numbers of 4.

        while (answer1.size() < 4) {
            answer1.add(rm.nextInt(10));
        }

        String gNum = "";
        for (Integer integer : answer1) {
            gNum += integer;
        }
        System.out.println(gNum);
        
        int userGuessFinal = Integer.parseInt(gNum);
        System.out.println(userGuessFinal);
        
        List<Integer> answerList = new ArrayList<>(answer1);

        String answerString = "";//converting the answers to string
        for (Integer i : answer1) {
            answerString += i;
        }
        Collections.shuffle(answerList);

        System.out.println(answerList);
    }

}
