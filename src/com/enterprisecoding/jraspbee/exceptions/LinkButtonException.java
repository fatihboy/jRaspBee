package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown if the link button hasn't been pressed in the last 30 seconds.
 */
@SuppressWarnings("serial")
public class LinkButtonException extends ApiException {
    public LinkButtonException() {
    }

    public LinkButtonException(String message) {
        super(message);
    }
}