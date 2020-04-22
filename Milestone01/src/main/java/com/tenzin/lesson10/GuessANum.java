package com.tenzin.lesson10;

import java.util.Random;
import java.util.Scanner;



public class GuessANum {
    
   // static int theNum;
    
    public static void main(String[] args) {
       // Random rand = new Random();
       // int theNum = rand.nextInt(99)+1;
       
        int theNum = generate();
        int theGuess=0;
        int guesses=0;
        boolean win=false;
        
      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("Please guess a number between 1-99");
        do{
            guesses++;
            theGuess = userGuess();
            win = didWin(theGuess, theNum);
            /*
            if(theGuess>theNum){
                System.out.println("Too High");
            }
            else if(theGuess<theNum){
                System.out.println("Too Low");
            }
            else{
                System.out.println("You Win");
            }
            */
            
        }while(!win);
        
        
        System.out.println("It took you " + guesses + " guesses");
        
        
    }
    
    public static int generate(){
        Random rand = new Random();
        return rand.nextInt(99)+1;
    }
    
    public static int userGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please guess a number between 1-99");
        return scan.nextInt();
    }
    
    public static boolean didWin(int guess, int num){
        boolean result=false;
        
            if(guess>num){
                System.out.println("Too High");
                //return false;
            }
            else if(guess<num){
                System.out.println("Too Low");
                //return false;
            }
            else{
                System.out.println("You Win");
                result = true;
            }
            return result;
    }
}