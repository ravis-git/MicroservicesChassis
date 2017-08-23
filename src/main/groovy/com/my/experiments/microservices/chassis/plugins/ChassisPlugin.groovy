package com.my.experiments.microservices.chassis.plugins

import groovy.util.logging.Slf4j
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.GroovyPlugin
import org.gradle.api.plugins.JavaPlugin;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@Slf4j
class ChassisPlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {

        // add repositories to the microservices buildscript & projects as needed
        project.buildscript.repositories {
            mavenCentral()
        }

        project.repositories {
            mavenCentral()
            mavenLocal() // mavel local to use the local maven repo for managing plugin dependency
        }

        //apply required plugins
        project.apply plugin: JavaPlugin
        project.apply plugin: GroovyPlugin
        project.apply plugin: 'org.springframework.boot' // requried dependency was added in build.gradle

        // add all other common dependencies for all microservices

//        addJerseyDependencies(project)
//        addLombokDependencies(project)
        addPluginAsDependency(project)
//        addConsulDependencies(project)
    }

/*    private addJerseyDependencies(Project project) {
        log.info " ========== loading spring boot version: ${springBootVersion} == "
        project.dependencies.add('compile', 'org.springframework.boot:spring-boot-starter-jersey:1.5.6.RELEASE')
    }*/


/*    private static void addLombokDependencies(Project project) {
        project.dependencies.add('compile', 'org.projectlombok:lombok:1.16.10')
    }*/

    // add self as a dependency to all microservices to use the dependencies compile and runtime
    private addPluginAsDependency(Project project) {
        project.dependencies.add('compile',
                'com.my.experiments.microservices.chassis.plugins:MicroservicesChassis:0.0.1-SNAPSHOT')
    }

//    private addConsulDependencies(Project project) {
//        project.dependencies.add('compile',
//                'org.springframework.cloud:spring-cloud-starter-consul-discovery:1.2.1.RELEASE')
//    }
}
