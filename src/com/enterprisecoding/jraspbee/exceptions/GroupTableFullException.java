/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when adding more than 16 groups (excluding all lights group) to a bridge.
 */
@SuppressWarnings("serial")
public class GroupTableFullException extends ApiException {
    public GroupTableFullException() {
    }

    public GroupTableFullException(String message) {
        super(message);
    }
}