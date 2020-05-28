package com.tenzin.assessments;

/**
 *
 * @author Tenzin Woesel Apr 26, 2020
 */
public class SummarativeSums {

    public static int addArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        int[] firstArray = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] secondArray = {999, -60, -77, 14, 160, 301};
        int[] thirdArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + addArray(firstArray));
        System.out.println("#2 Array Sum: " + addArray(secondArray));
        System.out.println("#3 Array Sum: " + addArray(thirdArray));

    }

}
