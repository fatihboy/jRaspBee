package com.enterprisecoding.jraspbee;

public class Device {
	private String id;
	private boolean factorynew;
    private String address;
    
    Device() {
    }

    void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the id of the device.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    public boolean getFactorynew() {
        return factorynew;
    }

    /**
     * Returns the address of the device.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }
}
