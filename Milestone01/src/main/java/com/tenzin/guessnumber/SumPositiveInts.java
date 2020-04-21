package com.tenzin.guessnumber;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 *
 * 1. Prompt the user to enter a positive integer 
 * 2. store input as int 
 * 3. declare/initialize var to 0. 
 * 4. start loop as long as data they entered is
 * greater than 0 var = var + (user input % 10) user input = user input / 10 5.
 * end loop 6. print user input 7. print sum
 *
 *
 */
public class SumPositiveInts {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userNum = 0;
        System.out.println("Please enter a positive number");
        userNum = userInput.nextInt();
        userInput.nextLine();
        System.out.println("You entered :" + userNum);

        int sum = 0;
        
        for (int i = 0; userNum > 0; i++) {
            sum = sum + (userNum % 10);
            userNum = userNum / 10;
        }

//       while (userNum > 0) {
//
//            sum = sum + (userNum % 10);
//            userNum = userNum / 10;
//
//        }
        System.out.println("sum is : " + sum);
    }

}
