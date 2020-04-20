package com.tenzin.exercise6;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 19, 2020
 */
public class BewareTheKraken {

    public static void main(String[] args) {

        System.out.println("Already, get the flippers and wetsuit on - we're going driving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        Scanner sc = new Scanner(System.in);
        
        //Turns out the ocean is only so deep, 36200 at the deepest survey,
        //so if we reach the bottom...we should probably stop.
        while (depthDivedInFt < 36200) {

            System.out.println("So far, we've swum " + depthDivedInFt + " feet.");
            
            if (depthDivedInFt >= 10500){
                System.out.println("Do you want to stop?");
                String response = sc.nextLine();
                if(response.equals("y")){
                    System.out.println("We are going back to the surface.");
                    break;
                }else{
                    System.out.println("We continue...");
                   
                }
            }

            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhhh, I think I see a Kraken, guys....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            //I can swim, reaally fast! 500ft at a time!
            depthDivedInFt += 1000;

        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");

    }

}
 ////To be completed