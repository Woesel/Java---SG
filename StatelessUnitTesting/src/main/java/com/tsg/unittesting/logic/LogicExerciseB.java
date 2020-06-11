/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseB {

    /**
     * Given a number, return the 'place rank' word associated with it. I.e.
     * pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! Also, start
     * by going up to 100, but stretch to more if you can!
     *
     * Ex: placeOf( 1 ) -> "1st" placeOf( 3 ) -> "3rd" placeOf( 22 ) -> "22nd"
     *
     * @param place
     * @return String
     */
    public String placeOf(int place) {

        String placeRank = "";
        //1st 2nd 3rd 4th 5th 6th 7th 8th 9th 0th 11th 12th
        if (place == 11 || place
                == (12) || place == (13) || place == (14) || place == (15) || place == (16) || place == (17) || place == (18) || place == (19) || place == (20)) {
            placeRank += place;
            placeRank += "th";
            return placeRank;
        } else if (place == 1 || place % 10 == 1) {
            placeRank += place;
            placeRank += "st";

            return placeRank;

        } else if (place == 2 || place % 10 == 2) {
            placeRank += place;
            placeRank += "nd";

            return placeRank;

        } else if (place == 3 || place % 10 == 3) {
            placeRank += place;
            placeRank += "rd";

            return placeRank;

        } else if (place % 100 == 1) {
            placeRank += place;
            placeRank += "rd";
            return placeRank;
        } else {
            return placeRank;
        }
    }

}
