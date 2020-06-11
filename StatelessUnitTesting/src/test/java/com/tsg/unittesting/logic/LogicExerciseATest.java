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
 * @author ttibe
 */
public class LogicExerciseATest {
    
    public LogicExerciseATest() {
    }

    /**
     * Test of friendlyGreeting method, of class LogicExerciseA.
     */
    @Test
    public void testFriendlyGreeting() {
        System.out.println("friendlyGreeting");
        String visitorName = "";
        boolean isFriend = false;
        String expResult = "";
        String result = LogicExerciseA.friendlyGreeting(visitorName, isFriend);
        assertEquals(expResult, result);
    }
    @Test
    public void testFriendlyGreetingForGoofus() {
        System.out.println("friendlyGreeting");
        String visitorName = "Goofus";
        boolean isFriend = false;
        String expResult = "hi";
        String result = LogicExerciseA.friendlyGreeting(visitorName, isFriend);
        assertEquals(expResult, result);
    }
    @Test
    public void testFriendlyGreetingForGallant() {
        System.out.println("friendlyGreeting");
        String visitorName = "Gallant";
        boolean isFriend = true;
        String expResult = "Hello, Gallant!";
        String result = LogicExerciseA.friendlyGreeting(visitorName, isFriend);
        assertEquals(expResult, result);
    }
    @Test
    public void testFriendlyGreetingForNull() {
        System.out.println("friendlyGreeting");
        String visitorName = null;
        boolean isFriend = false;
        String expResult = "...";
        String result = LogicExerciseA.friendlyGreeting(visitorName, isFriend);
        assertEquals(expResult, result);
    }
    
    
    
}
