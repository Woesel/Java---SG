
package com.tenzin.carlot.service;

/**
 *
 * @author Tenzin Woesel
 * Jun 5, 2020
 */
public class OverpaidPriceException extends Exception{
    
    public OverpaidPriceException(String message) {
        super(message);
    }

    public OverpaidPriceException(String message, Throwable cause) {

        super(message, cause);
    }

}
