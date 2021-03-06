/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee.exceptions;

/**
 * Thrown when the specified user is no longer whitelisted on the bridge.
 */
@SuppressWarnings("serial")
public class UnauthorizedException extends ApiException {
    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}