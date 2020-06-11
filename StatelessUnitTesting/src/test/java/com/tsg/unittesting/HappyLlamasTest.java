/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

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
public class HappyLlamasTest {
    
    public HappyLlamasTest() {
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
     * Test of areTheLlamasHappy method, of class HappyLlamas.
     */
    @Test
    public void testAreTheLlamasHappy() {
        System.out.println("areTheLlamasHappy");
        boolean ultraBouncy = false;
        int trampolines = 0;
        boolean expResult = false;
        boolean result = HappyLlamas.areTheLlamasHappy(ultraBouncy, trampolines);
        assertEquals(expResult, result);
    }
    
}
