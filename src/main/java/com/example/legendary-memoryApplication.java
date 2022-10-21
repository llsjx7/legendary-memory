package com.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class legendary-memoryApplication extends Application<legendary-memoryConfiguration> {

    public static void main(final String[] args) throws Exception {
        new legendary-memoryApplication().run(args);
    }

    @Override
    public String getName() {
        return "legendary-memory";
    }

    @Override
    public void initialize(final Bootstrap<legendary-memoryConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(legendary-memoryConfiguration configuration,
                    Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(
            configuration.getTemplate(),
            configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}
