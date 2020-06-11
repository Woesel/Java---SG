/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

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
public class ArrayExerciseDTest {

    public ArrayExerciseDTest() {
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
     * Test of pointFree method, of class ArrayExerciseD.
     */
    @Test
    public void testPointFree() {
        System.out.println("pointFree");
        double[] numbers = null;
        int expResult = 0;
        int result = ArrayExerciseD.pointFree(numbers);
        assertEquals(expResult, result);
    }
    @Test
    public void testPoint22() {
        System.out.println("pointFree");
        
        //Arrange
        double[] numbers = {1.1, .22};
        int expResult = 22;
        //Act
        int result = ArrayExerciseD.pointFree(numbers);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testPoint5005() {
        System.out.println("pointFree");
        
        //Arrange
        double[] numbers = {.039 , 20 , .005005};
        int expResult = 5005;
        //Act
        int result = ArrayExerciseD.pointFree(numbers);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testPointNegativeNumbers() {
        System.out.println("pointFree");
        
        //Arrange
        double[] numbers = {-9.9 , -700 , -.5};
        int expResult = -5;
        //Act
        int result = ArrayExerciseD.pointFree(numbers);
        //Assert
        assertEquals(expResult, result);
    }

}
