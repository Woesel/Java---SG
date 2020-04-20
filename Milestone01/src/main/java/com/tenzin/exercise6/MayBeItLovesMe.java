/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise6;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel April 19, 2020
 */
public class MayBeItLovesMe {

    public static void main(String[] args) {

        int petals;
        Random rand = new Random();
        boolean lovesMe = false;

        petals = rand.nextInt((89 - 13) + 1) + 13;
        System.out.println(petals);

        while (petals > 0) {

            if (lovesMe) {

                System.out.println("It LOVES me!");
                petals--;
                lovesMe = false;
            } else {
                System.out.println("It love me NOT!!");
                petals--;
                lovesMe = true;
            }
        }
        if (lovesMe) {
            System.out.println("Awwwww.....bummmmer.! It DOESN'T love me!");

        } else {
            System.out.println("Oh WOW! It really LOVES me.!");
        }

    }

}
