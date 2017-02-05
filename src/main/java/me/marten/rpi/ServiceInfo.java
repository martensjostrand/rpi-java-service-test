package me.marten.rpi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceInfo {

    @JsonProperty("message")
    private final String message;

    public ServiceInfo(String message) {
        this.message = message;
    }
}
