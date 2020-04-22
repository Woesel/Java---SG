package com.tenzin.exercise8;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel Apr 21, 2020
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = colors();
        String animal = animals();
        String colorAgain = colors();
        int weight = numbers(5, 100);
        int distance = numbers(10, 20);
        int number = numbers(1000, 2000);
        int time = numbers(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", " + weight + "lb " + " miniature " + animal + " for over " + distance + " miles!!!");
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");

    }
    Random rand = new Random();

    public static String colors() {
        String colorName = "";
        Random rand = new Random();
        int i = rand.nextInt(5);

        switch (i) {
            case 1:
                colorName = "Blue";
                break;
            case 2:
                colorName = "Red";
                break;
            case 3:
                colorName = "Yellow";
                break;
            case 4:
                colorName = "Pink";
                break;
            case 5:
                colorName = "Green";
                break;
            default:
                break;
        }
        return colorName;
    }//end of color chooser

    public static String animals() {

        String nameOfAnimals = "";
        Random rand = new Random();
        int i = rand.nextInt(5);

        switch (i) {
            case 1:
                nameOfAnimals = "Cat";
                break;
            case 2:
                nameOfAnimals = "Dog";
                break;
            case 3:
                nameOfAnimals = "Dragon";
                break;
            case 4:
                nameOfAnimals = "Snow Lion";
                break;
            case 5:
                nameOfAnimals = "Cows";
                break;
            default:
                break;
        }
        return nameOfAnimals;

    }

    public static int numbers(int min, int max) {

        Random rand = new Random();
        int ranges = rand.nextInt((max - min)+1) + min;
        return ranges;
    }

}
