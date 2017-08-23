package com.my.experiments.microservices.chassis.config;

import com.my.experiments.microservices.chassis.operations.HealthApi;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@Slf4j
public abstract class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
      log.info ("==== Jersey initialized in the chassis project ==== ");
        register(HealthApi.class);
    }
}
