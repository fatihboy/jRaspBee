/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when operating on a group, light or user that doesn't exist.
 */
@SuppressWarnings("serial")
public class EntityNotAvailableException extends ApiException {
    public EntityNotAvailableException() {
    }

    public EntityNotAvailableException(String message) {
        super(message);
    }
}