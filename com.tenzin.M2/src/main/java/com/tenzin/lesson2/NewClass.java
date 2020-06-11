
package com.tenzin.lesson2;

import java.util.*; 
public class NewClass { 
    public static void main(String[] args) 
    { 
  
        // create random object 
        Random r = new Random(); 
  
        // return the next pseudorandom integer value 
        System.out.println("Random Integer value : "
                           + r.nextInt()); 
  
        // setting seed 
        long s = 22; 
  
        r.setSeed(s); 
  
        // value after setting seed 
        System.out.println("Random Integer value : "
                           + r.nextInt()); 
    } 
} 