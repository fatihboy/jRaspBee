package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when scheduling an invalid command.
 */
@SuppressWarnings("serial")
public class InvalidJsonException extends ApiException {
    public InvalidJsonException() {
    }

    public InvalidJsonException(String message) {
        super(message);
    }
}