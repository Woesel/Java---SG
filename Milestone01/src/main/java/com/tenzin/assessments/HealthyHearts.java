package com.tenzin.assessments;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Make a simple calculator that asks the user for their age. 
 * Then calculate the healthy heart rate range for that age, and display it.
 * Their maximum heart rate should be 220 - their age.
 * The target heart rate zone is the 50 - 85% of the maximum.
 *
 * @author Tenzin Woesel Apr 26, 2020
 */
public class HealthyHearts {

    public static void main(String[] args) {

        int age, maxHR;
        double targetHRMin, targetHRMax;

        Scanner userInput = new Scanner(System.in);

        System.out.println("How old are you? ");
        age = userInput.nextInt();

        maxHR = 220 - age;
        DecimalFormat df = new DecimalFormat("0");
        targetHRMin = 0.5 * maxHR;
        targetHRMax = 0.85 * maxHR;

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR zone is " + df.format(targetHRMin) + " - " + df.format(targetHRMax) + " beats per minute.");

    }

}
