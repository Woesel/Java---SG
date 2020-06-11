/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ttibe
 */
public class LogicExerciseETest {
    
    public LogicExerciseETest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of whatColor method, of class LogicExerciseE.
     */
    @Test
    public void testWhatColor() {
        System.out.println("whatColor");
        int waveLengthNM = 0;
        int frequencyTHZ = 0;
        double photonicEnergyEV = 0.0;
        String expResult = "";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    @Test
    public void testWhatColorYellow() {
        System.out.println("whatColor");
        int waveLengthNM = 575;
        int frequencyTHZ = 510;
        double photonicEnergyEV = 2.15;
        String expResult = "Yellow";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    @Test
    public void testWhatColorViolet() {
        System.out.println("whatColor");
        int waveLengthNM = 449;
        int frequencyTHZ = 670;
        double photonicEnergyEV = 3.0;
        String expResult = "Violet";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    @Test
    public void testWhatColorUnknown() {
        System.out.println("whatColor");
        int waveLengthNM = 621;
        int frequencyTHZ = 475;
        double photonicEnergyEV = 16.5;
        String expResult = "Unknown";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    @Test
    public void testWhatColorOrange() {
        System.out.println("whatColor");
        int waveLengthNM = 590;
        int frequencyTHZ = 508;
        double photonicEnergyEV = 2.05;
        String expResult = "Orange";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    @Test
    public void testWhatColorYellowGreen() {
        System.out.println("whatColor");
        int waveLengthNM = 570;
        int frequencyTHZ = 526;
        double photonicEnergyEV = 2.17;
        String expResult = "Yellow-Green";
        String result = LogicExerciseE.whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(expResult, result);
    }
    
}
