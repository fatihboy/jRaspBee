package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.Map;

import com.enterprisecoding.gson.reflect.TypeToken;

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