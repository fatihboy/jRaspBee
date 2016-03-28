package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.Map;

import com.enterprisecoding.gson.reflect.TypeToken;

/**
 * Basic group information.
 */
public class Group {
    public final static Type gsonType = new TypeToken<Map<String, Group>>() {
    }.getType();

    private String id;
    private String name;
    private String eTag;

    Group() {
        this.id = "0";
        this.name = "Lightset 0";
    }

    void setName(String name) {
        this.name = name;
    }

    void setId(String id) {
        this.id = id;
    }

    void seteTag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * Returns if the group can be modified.
     * Currently only returns false for the all lights pseudo group.
     *
     * @return modifiability of group
     */
    public boolean isModifiable() {
        return !id.equals("0");
    }

    /**
     * Returns the id of the group.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the name of the group.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the eTag of the group.
     *
     * @return eTag
     */
    public String geteTag() {
        return eTag;
    }
}