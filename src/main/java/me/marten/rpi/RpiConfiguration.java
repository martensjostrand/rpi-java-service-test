package me.marten.rpi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class RpiConfiguration extends Configuration {

    private final String message;


    @JsonCreator
    public RpiConfiguration(@JsonProperty("message") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
