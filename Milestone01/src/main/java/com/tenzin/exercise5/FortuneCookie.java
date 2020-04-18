
package com.tenzin.exercise5;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel
 */
public class FortuneCookie {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
    
        
        
        int x = rand.nextInt(10);
        
        System.out.print("Your fortune says: ");
        
        switch(x){
            
            case 0 :
                System.out.println("The greatest danger could be your stupidity.");
            
            case 1 :
                System.out.println("To truely find yourself, you should play hide and seek alone.");
                break;
            case 2 : 
                System.out.println("You are a leaf on the wind, watch how you soar.");
                break;
            case 3 :
                System.out.println("You will stumble into the Happiness of your life.");
                break;
            case 4 :
                System.out.println("Why not treat yourself to a good time instead of waiting for someone else to do it?");
                break;
            case 5 :
                System.out.println("Goonies never say die.");
                break;
            case 6 :
                System.out.println("An alien or some sort will be appearing to your shortly.");
                break;
            case 7 :
                System.out.println("Error 404: Fortune not found");
                break;
            case 8 :
                System.out.println("Success lies in the hands of those who wants it.");
                break;
            case 9 :
                System.out.println("It's amazing how much good you can do if you don't care who gets the credit.");
                break;
        }
        
    }
 }
