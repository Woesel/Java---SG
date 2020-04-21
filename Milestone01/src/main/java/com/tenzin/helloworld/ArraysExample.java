/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.helloworld;

/**
 *
 * @author ttibe
 */
public class ArraysExample {
    
    public static void main(String[] args) {
        
        int[] myInts = {1,2,3};
        int[] myOtherInts = new int[3];
        myOtherInts[0] = 1;
        myOtherInts[1] = 2;
        myOtherInts[2] = 3;
        
        /*
        both the following for loops does the same thing
        */
        
        for (int counter1 = 0; counter1 < myOtherInts.length; counter1++) {
            myInts[counter1] = 99;
            
        }
        
        for (int counter = 0; counter < 3; counter++) {     //manually upgrading //traditional loop
            
            System.out.println(myInts[counter]);
            
        }
        
        /*
        data here is the reference to the index
        */
        
        for(int data1 : myInts){
            
            data1 = 99;
        }
        for(int data : myInts){                 // gives control over accessing each 
            
            System.out.println(data);
        }
    }
    
}
