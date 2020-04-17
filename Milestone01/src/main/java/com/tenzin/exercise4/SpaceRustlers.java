
package com.tenzin.exercise4;

/**
 *
 * @author Tenzin Woesel
 */
public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships){    //if checks this condition
            
            System.out.println("Vrroom, vroom! Let's get going!");
        }else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        /* we use if-else when we want to consider multiple conditions */
        
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        }else if(cows > spaceships){ //removing else from else-if doesn't change anything in this condition
            System.out.println("Dangit! I don't know how we are going to fit all these cows in here!");
        }else{
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }else if(cows == aliens || cows >aliens){
            System.out.println("Oh no!The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
    
}
