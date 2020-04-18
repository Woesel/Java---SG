package com.tenzin.exercise4;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel April 17, 2020
 */
public class FieldDay {

    public static void main(String[] args) {

        String name;
//        String name2;
        
         // Baggins,  Dresden, Howl, Potter, Vimes;
         // Baggins 

        Scanner sc = new Scanner(System.in);

//        System.out.println("First Name");
//        name1 = sc.nextLine();
//        
//        System.out.println("First Name");
//        name2 = sc.nextLine();
//        
//        if(name2.compareTo(name1)>0){
//            System.out.println("name1 comes before name2");
//        }
//        else if(name2.compareTo(name1)<0){
//            System.out.println("name2 comes before name1");
//        }
//        
//        System.out.println(name2.compareTo(name1));
//    }
//}
            System.out.println("What's your last name? ");
            name = sc.nextLine();
        
        if(name.compareTo("Baggins") <= 0){
            
            System.out.println("Aha! You're on the team \"Red Dragons\"!");
            
        }
        else if(name.compareToIgnoreCase("Baggins") > 0 && name.compareToIgnoreCase("Dresden") <= 0){
            
            System.out.println("Aha! You're on the team \"Dark Wizards\"!");
        }
        else if(name.compareTo("Dresden") > 0 && name.compareTo("Howl") <= 0){
           
            System.out.println("Aha! You're on the team \"Moving Castles\"");
        }
        else if(name.compareTo("Howl") > 0 && name.compareTo("Potter") <= 0){
            
            System.out.println("Aha! You're on the team \"Golden Snitches\"!");
        }
        else if(name.compareTo("Potter") > 0 && name.compareTo("Vimes") <= 0){
            System.out.println("Aha! You're on the team \"Night Guards\"!");
        }
        else if(name.compareTo("Vimes") > 0 ){
            System.out.println("Aha! you're on the team \"Black Holes\"!");
        }
        System.out.println("Good luck in the games!");
        }
    }
