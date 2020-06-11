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
public class StringsExerciseCTest {
    
    public StringsExerciseCTest() {
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
     * Test of removeTheVowels method, of class StringsExerciseC.
     */
    @Test
    public void testRemoveTheVowels() {
        System.out.println("removeTheVowels");
        String word = "";
        String expResult = "";
        String result = StringsExerciseC.removeTheVowels(word);
        assertEquals(expResult, result);
    }
    @Test
    public void testRemoveTheVowelsFromTruncate() {
        System.out.println("removeTheVowels");
        String word = "truncate";
        String expResult = "trnct";
        String result = StringsExerciseC.removeTheVowels(word);
        assertEquals(expResult, result);
    }
    @Test
    public void testRemoveTheVowelsFromSquashed() {
        System.out.println("removeTheVowels");
        //Arrange
        String word = "squashed";
        String expResult = "sqshd";
        //Act
        String result = StringsExerciseC.removeTheVowels(word);
        //Assert
        assertEquals(expResult, result);
    }
    @Test
    public void testRemoveTheVowelsFromCompressed() {
        System.out.println("removeTheVowels");
        String word = "compressed";
        String expResult = "cmprssd";
        String result = StringsExerciseC.removeTheVowels(word);
        assertEquals(expResult, result);
    }
    
}
