package com.tenzin.factorizer;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 22, 2020
 */
public class Factorizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        int userNum = Integer.parseInt(sc.nextLine());
        int count = 0, sum = 0;

        for (int i = 1; i <= userNum; i++) {

            if (userNum % i == 0) {

                System.out.print(i + " ");
                sum = sum + i;
                count++;
            }
        }
        System.out.println("\n" + userNum + " has " + count + " factors.");
        if ((sum - userNum) == userNum) {
            System.out.println(userNum + " is perfect number.");
        }else {
            System.out.println(userNum + " is not a perfect number.");
        }
        if (count == 2) {
            System.out.println(userNum + " is a prime number.");
        } else {
            System.out.println(userNum + " is not a prime number.");
        }

    }

}
