/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.lesson2;

import static com.tenzin.lesson2.HappyLlamas.areTheLlamasHappy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class HappyLlamasTest {

    public HappyLlamasTest() {
    }

    @Test
    public void testNormalTrampoline10() {
        //ARRANGE -for simple methods, this means setting up the parameters

        boolean isNasaFabric = false;
        int numTrampolines = 10;

        //ACT - for simple methods, this generally means calling the method under tests
        //and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //ASSERT - basically just a conditional that proves the result is what
        //you expect to be, plus an extra message to display if it doesn't match
        //There are a wide variety of assert types, here we just want to
        //assert that it returned false value.
        assertFalse(result, "10 Llamas w/ Normal Trampolines should be unhappy!");
    }

    @Test
    public void testNormalTrampoline24() {

        boolean isNasaFabric = false;
        int numTrampolines = 24;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "24 Llamas w/ Normal Trampolines should be unhappy!");
    }

    @Test
    public void testNormalTrampoline30() {

        boolean isNasaFabric = false;
        int numTrampolines = 30;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "30 Llamas w/ Normal Trampolines should be unhappy!");
    }

    @Test
    public void testNormalTrampoline42() {

        boolean isNasaFabric = false;
        int numTrampolines = 42;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "42 Llamas w/ Normal Trampolines should be unhappy!");
    }

    @Test
    public void testNormalTrampoline50() {

        boolean isNasaFabric = false;
        int numTrampolines = 50;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "50 Llamas w/ Normal Trampolines should be unhappy!");
    }

    @Test
    public void testUltraBouncyTrampoline10() {

        boolean isNasaFabric = true;
        int numTrampolines = 10;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "10 Llamas w/ Ultra Bouncy Trampolines should be happy!");
    }

    @Test
    public void testUltraBouncyTrampoline24() {

        boolean isNasaFabric = true;
        int numTrampolines = 24;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "24 Llamas w/ Ultra Bouncy Trampolines should be happy!");
    }

    @Test
    public void testUltraBouncyTrampoline30() {

        boolean isNasaFabric = true;
        int numTrampolines = 30;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "34 Llamas w/ Ultra Bouncy Trampolines should be happy!");
    }

    @Test
    public void testUltraBouncyTrampoline42() {

        boolean isNasaFabric = true;
        int numTrampolines = 42;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "24 Llamas w/ Ultra Bouncy Trampolines should be happy!");
    }

    @Test
    public void testUltraBouncyTrampoline50() {

        boolean isNasaFabric = true;
        int numTrampolines = 50;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse(result, "50 Llamas w/ Ultra Bouncy Trampolines should be happy!");
    }

}
