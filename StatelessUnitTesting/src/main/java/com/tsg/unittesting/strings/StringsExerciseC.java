/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.strings;

/**
 *
 * @author ahill
 */
public class StringsExerciseC {

    /**
     * Take a word, and remove all its vowels and returns it.
     *
     * Ex: removeTheVowels( "truncate" ) -> "trnct" removeTheVowels( "squashed"
     * ) -> "sqshd" removeTheVowels( "compressed" ) -> "cmprssd"
     *
     * @param word
     * @return String
     */
    public static String removeTheVowels(String word) {
        String removed = "";
        if (word != "") {
            for (int i = 0; i < word.length(); i++) {
                removed = word.replaceAll("[aeiouAEIOU]", "");

            }
            return removed;
        }
        return removed;
    }

}
