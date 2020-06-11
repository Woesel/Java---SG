/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ttibe
 */
public class ArrayExerciseATest {

    public ArrayExerciseATest() {
    }

    /**
     * Test of maxOfArray method, of class ArrayExerciseA.
     */
    @Test
    public void testMaxOfArray1() {
        System.out.println("maxOfArray");
        //Arrange
        int[] numbers = {1};
        int expResult = 1;
        //Act
        int result = ArrayExerciseA.maxOfArray(numbers);
        //Assert
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxOfArray345() {
        System.out.println("maxOfArray");
        //Arrange
        int[] numbers = {3, 4, 5};
        int expResult = 5;
        //Act
        int result = ArrayExerciseA.maxOfArray(numbers);
        //Assert
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxOfArrayLast() {
        System.out.println("maxOfArray");
        //Arrange
        int[] numbers = {-9000, -700, -50, -3};
        int expResult = -3;
        //Act
        int result = ArrayExerciseA.maxOfArray(numbers);
        //Assert
        assertEquals(expResult, result);
    }

}
