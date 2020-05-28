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
public class ArrayExerciseETest {

    public ArrayExerciseETest() {
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
     * Test of camelCaseIt method, of class ArrayExerciseE.
     */
    @Test
    public void testCamelCaseIt() {
        //Arrange
        String[] words = {"llama", "llama", "duck"};
        String expResult = "llamaLlamaDuck";

        //Act
        String result = ArrayExerciseE.camelCaseIt(words);

        //Assert
        assertEquals(expResult, result);

    }

    @Test
    public void testCamelCaseIt1() {

        String[] words = {"lambs", "eat", "oats", "and", "does", "eat", "oats"};
        String expResult = "lambsEatOatsAndDoesEatOats";
        String result = ArrayExerciseE.camelCaseIt(words);
        assertEquals(expResult, result);
    }

    @Test
    public void testCamelCaseIt2() {
        //Arrange
        String[] words = {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"};
        String expResult = "doOrDoNotThereIsNoTry";

        //Act
        String result = ArrayExerciseE.camelCaseIt(words);

        //Assert
        assertEquals(expResult, result);
    }

}
