package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when the API returns an unknown error.
 */
@SuppressWarnings("serial")
public class MissingParametersException extends ApiException {
    public MissingParametersException() {
    }

    public MissingParametersException(String message) {
        super(message);
    }
}