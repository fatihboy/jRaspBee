/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 */
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