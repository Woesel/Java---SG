package com.tenzin.lesson10;

/**
 *
 * @author Tenzin Woesel Apr 21, 2020
 */
public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 2, 1};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("i =" + i + "current sum is: " + sum);
        }
        System.out.println("Final sum: " + sum);
        
        int[] number = {3, 7, 2, 4, 7, 12};
    }

}
