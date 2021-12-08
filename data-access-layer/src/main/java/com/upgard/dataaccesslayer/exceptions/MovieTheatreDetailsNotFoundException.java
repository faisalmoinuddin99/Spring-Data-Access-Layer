package com.upgard.dataaccesslayer.exceptions;

public class MovieTheatreDetailsNotFoundException extends Exception{
    public MovieTheatreDetailsNotFoundException() {
    }

    public MovieTheatreDetailsNotFoundException(String message) {
        super(message);
    }

    public MovieTheatreDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MovieTheatreDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public MovieTheatreDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
