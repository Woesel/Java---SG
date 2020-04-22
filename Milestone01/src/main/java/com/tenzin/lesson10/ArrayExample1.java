package com.tenzin.lesson10;

import java.util.Arrays;

/**
 *
 * @author Tenzin Woesel Apr 21, 2020
 */
public class ArrayExample1 {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 4, 7, 12};
        int temp;
        

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                boolean didSwap = false;
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    didSwap =true;
                }
                if(didSwap){
                    break;
                }
            }
             System.out.print(numbers[i] + " ");
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Shazena's way");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            
        }
    }

}
