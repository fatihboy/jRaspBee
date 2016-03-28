/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when trying to change the state of a light that is off.
 */
@SuppressWarnings("serial")
public class DeviceOffException extends ApiException {
    public DeviceOffException() {
    }

    public DeviceOffException(String message) {
        super(message);
    }
}