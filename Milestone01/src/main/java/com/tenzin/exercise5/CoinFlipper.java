/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.exercise5;

import java.util.Random;

/**
 *
 * @author Tenzin Woesel
 */
public class CoinFlipper {

    public static void main(String[] args) {

        System.out.println("Ready, Set, Flip....!!!");

        Random rand = new Random();

        boolean coinFlip = rand.nextBoolean();

        if (coinFlip == true) {
            System.out.println("You got TAILS!");
        } else if (coinFlip == false) {
            System.out.println("You got HEADS!");
        }

    }
}
