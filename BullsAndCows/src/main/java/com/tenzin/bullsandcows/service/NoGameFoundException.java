package com.tenzin.bullsandcows.service;

/**
 *
 * @author Tenzin Woesel Aug 30, 2020
 */
public class NoGameFoundException extends Exception {

    public NoGameFoundException(String message) {
        super(message);
    }

    public NoGameFoundException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
