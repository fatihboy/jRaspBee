/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import java.util.Date;

import com.enterprisecoding.gson.annotations.SerializedName;

/**
 * A whitelisted user.
 */
public class User {
    @SerializedName("last use date")
    private Date lastUseDate;

    @SerializedName("create date")
    private Date createDate;

    private String name;

    /**
     * Returns the last time a command was issued as this user.
     *
     * @return time of last command by this user
     */
    public Date getLastUseDate() {
        return lastUseDate;
    }

    /**
     * Returns the date this user was created.
     *
     * @return creation date of user
     */
    public Date getCreationDate() {
        return createDate;
    }

    /**
     * Returns the username of this user.
     *
     * @return username
     */
    public String getUsername() {
        return name;
    }
}