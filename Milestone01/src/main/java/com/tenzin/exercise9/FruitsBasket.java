package com.tenzin.exercise9;

/**
 *
 * @author Tenzin Woesel Apr 22, 2020
 */
public class FruitsBasket {

    public static void main(String[] args) {

        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruits = 0;
        int totalFruits = 0;

        for (String fruitBasket1 : fruitBasket) {
            if (null == fruitBasket1) {
                numOtherFruits++;
            } else switch (fruitBasket1) {
                case "Orange":
                    numOranges++;
                    break;
                case "Apple":
                    numApples++;
                    break;
                default:
                    numOtherFruits++;
                    break;
            }
            totalFruits = numOranges + numApples + numOtherFruits;
        }
        System.out.println("Total# of Fruit in Basket:" + totalFruits);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of other fruits: " + numOtherFruits);
        System.out.println("Number of Apples : " + numApples);
    }

}
