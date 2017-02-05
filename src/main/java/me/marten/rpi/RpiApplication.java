package me.marten.rpi;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class RpiApplication extends Application<RpiConfiguration> {


    @Override
    public void run(RpiConfiguration rpiConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new RpiResource(rpiConfiguration.getMessage()));
    }

    public static void main(final String[] args) throws Exception {
        new RpiApplication().run(args);
    }
}
