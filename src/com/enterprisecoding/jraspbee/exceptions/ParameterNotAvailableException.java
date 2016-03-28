package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when the API returns an unknown error.
 */
@SuppressWarnings("serial")
public class ParameterNotAvailableException extends ApiException {
    public ParameterNotAvailableException() {
    }

    public ParameterNotAvailableException(String message) {
        super(message);
    }
}