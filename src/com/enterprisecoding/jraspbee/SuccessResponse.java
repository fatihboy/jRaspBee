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
import java.util.Map;

import com.enterprisecoding.gson.reflect.TypeToken;

class SuccessResponse {
    public final static Type gsonType = new TypeToken<List<SuccessResponse>>() {
    }.getType();

    public Map<String, Object> success;
}
