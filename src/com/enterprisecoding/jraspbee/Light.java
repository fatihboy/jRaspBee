package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.Map;

import com.enterprisecoding.gson.reflect.TypeToken;

/**
 * Basic light information.
 */
public class Light {
    public final static Type gsonType = new TypeToken<Map<String, Light>>() {
    }.getType();

    private String id;
    private String name;
    private String eTag;

    Light() {
    }

    void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the id of the light.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the name of the light.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the eTag of the light.
     *
     * @return eTag
     */
    public String geteTag() {
        return eTag;
    }
}