/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

class ErrorResponse {
    public final static Type gsonType = new TypeToken<List<ErrorResponse>>() {
    }.getType();

    public class Error {
        private Integer type;
        private String address;
        private String description;
    }

    private Error error;

    public Integer getType() {
        return error.type;
    }

    public String getAddress() {
        return error.address;
    }

    public String getDescription() {
        return error.description;
    }
}