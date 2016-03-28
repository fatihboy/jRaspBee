/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
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