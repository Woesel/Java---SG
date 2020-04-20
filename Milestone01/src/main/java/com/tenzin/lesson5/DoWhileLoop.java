
package com.tenzin.lesson5;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 * @date April 16th , 2020
 */
public class DoWhileLoop {
    
    public static void main(String[] args) {
              
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i < 6);
        
        Scanner sc = new Scanner(System.in);
        int userNumber;
        String userNumberString;
        
        do{
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
            
            
        }while(userNumber < 1 || userNumber >20);
        
        System.out.println("Thank you!!! Your number was : " + userNumber);
        
    }
}
