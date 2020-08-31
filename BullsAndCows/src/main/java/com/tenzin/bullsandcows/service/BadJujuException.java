package com.tenzin.bullsandcows.service;

/**
 *
 * @author Tenzin Woesel Aug 30, 2020
 */
public class BadJujuException extends Exception {

    public BadJujuException(String message) {
        super(message);
    }

    public BadJujuException(String message,
            Throwable cause) {
        super(message, cause);
    }

}
