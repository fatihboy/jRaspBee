/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import java.util.Date;

/**
 * Detailed schedule information.
 */
public class FullSchedule extends Schedule {
    private String description;
    private ScheduleCommand command; // Not really appropriate for exposure
    private Date time;

    /**
     * Returns the description of the schedule.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the scheduled command.
     *
     * @return command
     */
    public ScheduleCommand getCommand() {
        return command;
    }

    /**
     * Returns the time for which the command is scheduled to be ran.
     *
     * @return scheduled time
     */
    public Date getTime() {
        return time;
    }
}