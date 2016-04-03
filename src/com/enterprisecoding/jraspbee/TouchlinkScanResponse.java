package com.enterprisecoding.jraspbee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class TouchlinkScanResponse {
	private String scanstate;
	private Date lastscan;
	private Map<String, Device> result;
	private ArrayList<Device> resultList;
	
	public String getScanstate() {
        return scanstate;
    }
	
	public Date getLastscan() {
        return lastscan;
    }
	
	public ArrayList<Device> getResult() {
		if(null==resultList){
			resultList = new ArrayList<Device>();

	        for (String id : result.keySet()) {
	        	Device device = result.get(id);
	        	device.setId(id);
	            resultList.add(device);
	        }
		}
		
		return resultList;
	}
}
