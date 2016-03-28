/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import java.util.Date;

@SuppressWarnings("unused")
class CreateScheduleRequest {
    private String name;
    private String description;
    private ScheduleCommand command;
    private Date time;

    public CreateScheduleRequest(String name, String description, ScheduleCommand command, Date time) {
        if (name != null && Util.stringSize(name) > 32) {
            throw new IllegalArgumentException("Schedule name can be at most 32 characters long");
        }

        if (description != null && Util.stringSize(description) > 64) {
            throw new IllegalArgumentException("Schedule description can be at most 64 characters long");
        }

        if (command == null) {
            throw new IllegalArgumentException("No schedule command specified");
        }

        this.name = name;
        this.description = description;
        this.command = command;
        this.time = time;
    }
}