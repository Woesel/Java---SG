package com.tenzin.bullsandcows.controller;

/**
 *
 * @author Tenzin Woesel Aug 30, 2020
 */
import java.time.LocalDateTime;

public class Error {

    private LocalDateTime timestamp = LocalDateTime.now().withNano(0);
    private String message;
    

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
