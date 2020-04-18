
package com.tenzin.exercise4;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class KnockKnock {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Knock Knock ! Guess who!!");
        String nameGuess = inputReader.nextLine();
        
        // if you change .equals to == it will ignore the if statement and print the else statement
        // if we don't type in the right capitalization, it'll print out the statement from else statement
        
        if(nameGuess.equalsIgnoreCase("Marty McFly")){        // we can use.equalsIgnoreCase to fix it 
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("....from the Future.");
        }else{
            System.out.println("Dude, do I look like " + nameGuess + "?"); 
           
        }
    }
    
}
