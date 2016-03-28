package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when the API returns an unknown error.
 */
@SuppressWarnings("serial")
public class ParameterNotModifiableException extends ApiException {
    public ParameterNotModifiableException() {
    }

    public ParameterNotModifiableException(String message) {
        super(message);
    }
}