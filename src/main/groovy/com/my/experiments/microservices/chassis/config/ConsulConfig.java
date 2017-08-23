package com.my.experiments.microservices.chassis.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
//@Configuration
@Component
@EnableDiscoveryClient
public class ConsulConfig {
}
