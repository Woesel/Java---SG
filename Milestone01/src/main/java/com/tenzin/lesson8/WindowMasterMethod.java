package com.tenzin.lesson8;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Apr 21, 2020
 */
public class WindowMasterMethod {

    public static void main(String[] args) {
        // Declare variables for height and width
        float height;
        float width;
        // Declare String variables to hold the user's height and width
        // input
        String stringHeight;
        String stringWidth;

        // Declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // Declare and initialize our Scanner
        Scanner sc = new Scanner(System.in);

        //get input from user
        height = readValue("Please enter window height");
        width = readValue("Please enter window width");

        // Get input from user
        /* System.out.println("Please enter window height:");
    stringHeight = sc.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = sc.nextLine();

    // Convert String values of height and width to floats
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);*/
        // Calculate area of window
        areaOfWindow = height * width;

        // Calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost - use hard coded for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    public static float readValue(String prompt){
        
        //declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        //pring prompt to console
        System.out.println(prompt);
        //read value into String data type
        String input = sc.next();
        float floatVal = Float.parseFloat(input);
        //return the float value
        return floatVal;
    }

}
