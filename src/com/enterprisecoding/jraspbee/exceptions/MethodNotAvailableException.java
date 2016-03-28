package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when trying to change the state of a light that is off.
 */
@SuppressWarnings("serial")
public class MethodNotAvailableException extends ApiException {
    public MethodNotAvailableException() {
    }

    public MethodNotAvailableException(String message) {
        super(message);
    }
}