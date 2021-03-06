/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 */
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