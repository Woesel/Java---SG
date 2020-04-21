/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class TwoForsAndTenYearsAgo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What year would you like to count back from?");
        int year = userInput.nextInt();

        for (int i = 0; i <= 10; i++) {                    //The starting range i which is 0
            System.out.println(i + " years ago would be " + (year - i));

        }

        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 20; i--) {     //The starting range will be the year given by the user 

            System.out.println((year - i) + " years ago would be " + i);
        }
    }

}
