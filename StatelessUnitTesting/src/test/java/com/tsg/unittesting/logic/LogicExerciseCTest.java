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
public class LogicExerciseCTest {
    
    public LogicExerciseCTest() {
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
     * Test of goWalky method, of class LogicExerciseC.
     */
    @Test
    public void testGoWalky() {
        System.out.println("goWalky");
        boolean isDark = false;
        boolean haveFlashlight = false;
        boolean isRaining = false;
        boolean haveUmbrella = false;
        int degreesFarenheit = 0;
        boolean expResult = false;
        boolean result = LogicExerciseC.goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(expResult, result);
    }

//     goWalky( true, false, true, true, 75  ) ->  false
//     goWalky( false, true, false, false, 50  ) ->  true
//     goWalky( false, false, false, false, 30  ) ->  false
    @Test
    public void testGoWalkyFirst() {
        System.out.println("goWalky");
        boolean isDark = true;
        boolean haveFlashlight = false;
        boolean isRaining = true;
        boolean haveUmbrella = true;
        int degreesFarenheit = 75;
        boolean expResult = false;
        boolean result = LogicExerciseC.goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(expResult, result);
    }

    @Test
    public void testGoWalkySecond() {
        System.out.println("goWalky");
        boolean isDark = false;
        boolean haveFlashlight = true;
        boolean isRaining = false;
        boolean haveUmbrella = false;
        int degreesFarenheit = 50;
        boolean expResult = true;
        boolean result = LogicExerciseC.goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(expResult, result);
    }

    @Test
    public void testGoWalkyThird() {
        System.out.println("goWalky");
        boolean isDark = false;
        boolean haveFlashlight = false;
        boolean isRaining = false;
        boolean haveUmbrella = false;
        int degreesFarenheit = 30;
        boolean expResult = false;
        boolean result = LogicExerciseC.goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(expResult, result);
    }
    
}
