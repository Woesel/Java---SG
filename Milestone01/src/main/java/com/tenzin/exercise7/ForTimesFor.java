package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 19, 2020
 */
public class ForTimesFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userNum, answer, userAnswer, compAnswer, counter = 0;

        System.out.println("Which time table do you want me to write?");
        userNum = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= 15; i++) {

            System.out.println("What is " + i + " x " + userNum + " : ");

            userAnswer = Integer.parseInt(sc.nextLine());
            compAnswer = userNum * i;
            if (userAnswer == compAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("Sorry, wrong. The answer is " + compAnswer);
            }
        }
        if(counter < (15 * 0.5) ){
            
            System.out.println("You need to work harder and study more.");           
            
        }else if(counter > (15 * 0.9)){
            
            System.out.println("Congratulations!! Your brain is cracked!");
        }else{
            System.out.println("You are a normal kid.");
        }
        System.out.println("You got " + counter + " correct.");

    }

}
