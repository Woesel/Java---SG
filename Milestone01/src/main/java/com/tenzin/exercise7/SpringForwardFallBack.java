
package com.tenzin.exercise7;

/**
 *
 * @author Tenzin Woesel
 * April 19, 2020
 */
public class SpringForwardFallBack {
    
    public static void main(String[] args) {
        
        System.out.println("It's Spring...! ");
        for(int i = 0; i < 10; i++){        //for Spring  the start range is 1
            
            System.out.print(i + ", ");
        }
        System.out.println("\n Oh no, it's fall...");
        for(int i = 10; i > 0; i--){        //for Fall the start range is 10
            
            System.out.print(i + ", ");
        }
        System.out.println("It's Spring...! ");
        for(int i = 10; i < 0; i--){        //we can update the first loops
            
            System.out.print(i + ", ");
        }
    }
    
}
