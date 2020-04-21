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
public class Add {

    public static void main(String[] args) {
       // int a = 5, b = 5;
      //  int result = a + b;
        
       // System.out.println(result);
       
       int result = add(5,6);
        System.out.println(result);
        System.out.println(add(7,10));
    }
    
    public static int add(int first , int second){
        
        return first+second;
    }

}
