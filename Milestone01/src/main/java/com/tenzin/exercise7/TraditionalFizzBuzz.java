package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 20, 2020
 */
public class TraditionalFizzBuzz {

    public static void main(String[] args) {

        int count = 0, userNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        userNum = Integer.parseInt(sc.nextLine());

        for (int i = 0; count <= userNum; i++) {
            
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Fizz Buzz");
                count++;

            }else if (i % 3 == 0) {
                System.out.println("Fizz");
                count++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                count++;
            }  else {
                System.out.println(i);

            }

        }
        System.out.println("TRADITION!!!!");

    }

}
