/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 *  
 *  Forked from Jue (https://github.com/Q42/Jue) a java library
 *  for managing Philips HUE Bridge
 */
package com.enterprisecoding.jraspbee;

import com.enterprisecoding.gson.Gson;

class Command {
    private String key;
    private Object value;

    public Command(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    String toJson() {
        return "\"" + key + "\":" + new Gson().toJson(value);
    }
}