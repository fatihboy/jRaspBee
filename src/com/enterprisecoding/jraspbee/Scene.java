/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 */
package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.Map;

import com.enterprisecoding.gson.reflect.TypeToken;

/**
 * Basic scene information.
 */
public class Scene {
	 public final static Type gsonType = new TypeToken<Map<String, Scene>>() {
	    }.getType();

	    private String id;
	    private String groupId;
	    private String name;

	    void setId(String id) {
	        this.id = id;
	    }

	    public String getId() {
	        return id;
	    }
	    
	    void setGroupId(String groupId) {
	        this.groupId = groupId;
	    }

	    public String getGroupId() {
	        return groupId;
	    }

	    public String getName() {
	        return name;
	    }
}
