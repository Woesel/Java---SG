package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 19, 2020
 */
public class ForTimes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userNum, answer;

        System.out.println("Which time table do you want me to write?");
        userNum = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= 15; i++) {

            answer = userNum * i;
            System.out.println(i + " x " + userNum + " is: " + answer);

        }

    }

}
