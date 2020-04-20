/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise6;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 18, 2020
 */
public class StayPositive {

    public static void main(String[] args) {

        int start, i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a starting number");
        start = Integer.parseInt(sc.nextLine());

        System.out.println("Counting down...");
        
         if(start>0){
            System.out.println("The number entered is not a positive number.");
        }

        while (start >= 0) {
            
            if(start == 0){
                System.out.println(start);
                break;
            }
            
            if (i % 10 == 0) {
                System.out.print("\n" + start + " ");
                start--;
                i++;
            }else{
                System.out.print(start + " ");
                start--;
                i++;
            }
           
        }
       
        System.out.println("\nBLAST OFF");
    }

}
