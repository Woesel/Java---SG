/*
 * This is Tenzin's Thing
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise7;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class DifferentKettleOfFish {

    public static void main(String[] args) {
        int fish = 1;
        
        for(int i =0;i<10;i++){
            if(fish==3){
                System.out.println("RED fish!");
            }else if(fish==4){
                System.out.println("BLUE fish!");
            }else{
                System.out.println(fish + " fish!");
            }
            fish++;
        }
//        while (fish < 10) {
//            if (fish == 3) {
//                System.out.println("RED fish!");
//            } else if (fish == 4) {
//                System.out.println("BLUE fish!");
//            } else {
//                System.out.println(fish + " fish!");
//            }
//            fish++;
//        }
    }

}
