/* jRaspBee - a Java library for RaspBee bridge
 *  Copyright (c) 2016 Fatih Boy (http://enterprisecoding.com)
 *  Licensed under the MIT (LICENSE).
 */
package com.enterprisecoding.jraspbee;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

class PortalDiscoveryResult {
	public final static Type gsonType = new TypeToken<List<PortalDiscoveryResult>>(){}.getType();
	
	private String internalipaddress;
	private String internalport;
	private String id;
	private String name;
	private String macaddress;
	
	public String getIPAddress() {
		return internalipaddress;
	}
	
	public String getPort() {
		return internalport;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMACAddress() {
		return macaddress;
	}
}