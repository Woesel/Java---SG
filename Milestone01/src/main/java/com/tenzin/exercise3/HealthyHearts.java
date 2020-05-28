
package com.tenzin.exercise3;

import java.text.DecimalFormat;
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

        System.out.print("How old are you? ");
        age = userInput.nextInt();

        maxHR = 220 - age;
        DecimalFormat df = new DecimalFormat("0");
        targetHRMin = Math.round(0.5 * maxHR) ;
     
        targetHRMax = Math.round(0.85 * maxHR);

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR zone is " + df.format(targetHRMin) + " - " + df.format(targetHRMax) + " beats per minute.");

    }

}
