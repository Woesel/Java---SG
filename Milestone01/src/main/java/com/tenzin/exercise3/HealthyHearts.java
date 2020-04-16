
package com.tenzin.exercise3;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel
 */
public class HealthyHearts {

    public static void main(String[] args) {

        int age, maxHR;
        double targetHRMin, targetHRMax;

        Scanner userInput = new Scanner(System.in);

        System.out.println("How old are you? ");
        age = userInput.nextInt();

        maxHR = 220 - age;
        targetHRMin = 0.5 * maxHR;
        targetHRMax = 0.85 * maxHR;

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR zone is " + targetHRMin + " - " + targetHRMax + " beats per minute.");

    }

}
