
package com.tenzin.carlot.service;

/**
 *
 * @author Tenzin Woesel
 * Jun 5, 2020
 */
public class NoSuchCarException extends Exception{
    
    public NoSuchCarException(String message){
        super(message);
    } 
    
    public NoSuchCarException(String message, Throwable cause){
        
        super(message, cause);
    }

}
