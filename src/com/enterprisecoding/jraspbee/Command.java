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