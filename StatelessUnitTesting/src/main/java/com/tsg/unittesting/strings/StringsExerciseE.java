/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.strings;

/**
 *
 * @author ahill
 */
public class StringsExerciseE {

    /**
     * Take in two Strings - return true if either String 'contains' the
     * other... but false if they are exactly equal, or completely different.
     *
     * Ex: containsTheOther( "one", "tone" ) -> true containsTheOther( "same",
     * "same" ) -> false containsTheOther( "fancypants", "pants" ) -> true
     * containsTheOther( "llama", "duck" ) -> false
     *
     * @param one
     * @param two
     * @return boolean
     */
    public static boolean containsTheOther(String one, String two) {
        boolean contains = false;
        if (one.equals(two)) {
            return contains;
        } else if (two.contains(one)) {
            contains = true;
            return contains;
        } else if (one.contains(two)) {
            contains = true;
            return contains;
        } else {
            return contains;
        }
    }
}
