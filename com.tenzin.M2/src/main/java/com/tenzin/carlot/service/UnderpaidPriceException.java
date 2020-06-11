package com.tenzin.carlot.service;

/**
 *
 * @author Tenzin Woesel Jun 5, 2020
 */
public class UnderpaidPriceException extends Exception {

    public UnderpaidPriceException(String message) {
        super(message);
    }

    public UnderpaidPriceException(String message, Throwable cause) {

        super(message, cause);
    }

}
