package com.enterprisecoding.jraspbee;

@SuppressWarnings("unused")
public class CreateSceneRequest {
	private String name;
	
	 public CreateSceneRequest(String name) {
	        if (name != null && Util.stringSize(name) > 32) {
	            throw new IllegalArgumentException("Schedule name can be at most 32 characters long");
	        }

	        this.name = name;
	    }
}
