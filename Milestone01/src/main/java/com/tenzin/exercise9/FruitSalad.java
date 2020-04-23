package com.tenzin.exercise9;

/**
 *
 * @author Tenzin Woesel Apr 22, 2020
 */
public class FruitSalad {

    public static void main(String[] args) {

        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        int appleCount = 0;
        int orangeCount = 0;
        int fruitCount = 0;

        for (String fruit1 : fruit) {

            if (fruit1.contains("berry")) {
                fruitSalad[fruitCount] = fruit1;
                fruitCount++;
            } else if (fruit1.contains("Apple") && appleCount < 3) {
                fruitSalad[fruitCount] = fruit1;
                fruitCount++;
                appleCount++;
            } else if (fruit1.contains("Orange") && orangeCount < 2) {
                fruitSalad[fruitCount] = fruit1;
                fruitCount++;
                orangeCount++;
            }
        }

        System.out.println("Our fruit salad contains total of : " + fruitCount + " fruits.");
        System.out.println("Following are the types of fruits that's in the salad : ");

        for (int i = 0; i < 12; i++) {
            if (fruitSalad[i] != null) {
                System.out.println(fruitSalad[i]);
            }
        }

    }

}
