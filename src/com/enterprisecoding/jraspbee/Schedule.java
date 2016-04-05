/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

/**
 * Basic schedule information.
 */
public class Schedule {
    public final static Type gsonType = new TypeToken<Map<String, Schedule>>() {
    }.getType();

    private String id;
    private String name;

    void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}