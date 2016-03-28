/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

@SuppressWarnings("unused")
class CreateUserRequest {
    private String username;
    private String devicetype;

    public CreateUserRequest(String username, String devicetype) {
        if (Util.stringSize(devicetype) > 40) {
            throw new IllegalArgumentException("Device type can be at most 40 characters long");
        }

        if (Util.stringSize(username) < 10 || Util.stringSize(username) > 40) {
            throw new IllegalArgumentException("Username must be between 10 and 40 characters long");
        }

        this.username = username;
        this.devicetype = devicetype;
    }

    public CreateUserRequest(String devicetype) {
        if (Util.stringSize(devicetype) > 40) {
            throw new IllegalArgumentException("Device type can be at most 40 characters long");
        }

        this.devicetype = devicetype;
    }
}