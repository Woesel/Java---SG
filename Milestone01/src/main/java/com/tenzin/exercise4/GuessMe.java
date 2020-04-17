package com.tenzin.exercise4;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * @date April 16, 2020
 */
public class GuessMe {

    public static void main(String[] args) {

        int num = 15;
        int usernum;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("I have chosen a number between 1-20. I'll give you cookies if you guess it right. ");
        System.out.println("Please guess the number : ");
        usernum = sc.nextInt();
        sc.nextLine();
        
        System.out.println("You guessed : " + usernum);
        
        if(usernum > num){
            System.out.println(usernum + "? Too bad, way too high. I chose " + num + ".");
        }
        else if(usernum < num){
            System.out.println(usernum + "? Ha, nice try - too low! I chose " + num + ".");
        }else{
            System.out.println("Wow, nice guess! That was it!");
        }
        

    }
}
