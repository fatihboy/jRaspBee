/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 */
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