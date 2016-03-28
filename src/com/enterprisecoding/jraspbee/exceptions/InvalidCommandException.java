package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when scheduling an invalid command.
 */
@SuppressWarnings("serial")
public class InvalidCommandException extends ApiException {
    public InvalidCommandException() {
    }

    public InvalidCommandException(String message) {
        super(message);
    }
}