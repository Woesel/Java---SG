/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

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
public class StringsExerciseETest {
    
    public StringsExerciseETest() {
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
     * Test of containsTheOther method, of class StringsExerciseE.
     */
    @Test
    public void testContainsTheOther() {
        System.out.println("containsTheOther");
        //Arrange
        String one = "";
        String two = "";
        boolean expResult = false;
        //Act
        boolean result = StringsExerciseE.containsTheOther(one, two);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsTheOtherOneAndTone() {
        System.out.println("containsTheOther");
        //Arrange
        String one = "one";
        String two = "tone";
        boolean expResult =true;
        //Act
        boolean result = StringsExerciseE.containsTheOther(one, two);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsTheOtherSameAndSame() {
        System.out.println("containsTheOther");
        //Arrange
        String one = "same";
        String two = "same";
        boolean expResult = false;
        //Act
        boolean result = StringsExerciseE.containsTheOther(one, two);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsTheOtherFancypants() {
        System.out.println("containsTheOther");
        //Arrange
        String one = "fancypants";
        String two = "pants";
        boolean expResult = true;
        //Act
        boolean result = StringsExerciseE.containsTheOther(one, two);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsTheOtherLlamaAndDuck() {
        System.out.println("containsTheOther");
        //Arrange
        String one = "llama";
        String two = "duck";
        boolean expResult = false;
        //Act
        boolean result = StringsExerciseE.containsTheOther(one, two);
        //Assert
        assertEquals(expResult, result);
    }
    
}
