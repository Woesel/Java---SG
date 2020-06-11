/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tenzin Woesel
 */
public class LogicExerciseBTest {

    public LogicExerciseBTest() {
    }

    /**
     * Test of placeOf method, of class LogicExerciseB.
     */
    @Test
    public void testPlaceOf() {
        System.out.println("placeOf");

        //A
        int place = 0;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceOf1() {
        System.out.println("placeOf");

        //A
        int place = 1;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "1st";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceOf3() {
        System.out.println("placeOf");

        //A
        int place = 3;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "3rd";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceOf22() {
        System.out.println("placeOf");

        //A
        int place = 22;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "22nd";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceOf23() {
        System.out.println("placeOf");

        //A
        int place = 23;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "23rd";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceOf24() {
        System.out.println("placeOf");

        //A
        int place = 24;
        LogicExerciseB instance = new LogicExerciseB();
        String expResult = "24th";
        String result = instance.placeOf(place);
        assertEquals(expResult, result);
    }

}
