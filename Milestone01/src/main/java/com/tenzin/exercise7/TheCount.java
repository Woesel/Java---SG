/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 19, 2020
 */
public class TheCount {

    public static void main(String[] args) {

        int start, end, counter;
        int newNum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a starting number: ");
        start = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter an ending number: ");
        end = sc.nextInt();
        sc.nextLine();

        System.out.print("Count by: ");
        counter = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i = counter + i) {

            System.out.print(i + " ");
            newNum++;
            if (newNum % 3 == 0) {

                System.out.println(" - Ah ah ah!");

            }

        }

    }

}
