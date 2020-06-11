/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.DogBuddy.howManyWoofs;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class DogBuddyTest {
    
    public DogBuddyTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testTenBones() {
        //Arrange
        int numBones = 10;
        
        //Act
        String woofs = howManyWoofs(numBones);
        
        //Assert
        String expectedWoofs = "Woof! Woof! Woof!";
        assertEquals(expectedWoofs, woofs, "Expected 3 woofs w/ 10 bones.");
    }

    /**
     * Test of howManyWoofs method, of class DogBuddy.
     */
    @Test
    public void testFiveBones() {
        String expectedWoofs = "Woof! Woof!";
        assertEquals(expectedWoofs, howManyWoofs(5));
    }
    @Test
    public void testZeroBones() {
        String expectedWoofs = "...";
        assertEquals(expectedWoofs, howManyWoofs(0));
    }
    
}
