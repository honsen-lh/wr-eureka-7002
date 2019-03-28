package com.leaderment.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication7002 {
    public static void main( String[] args ){
    	SpringApplication.run(EurekaApplication7002.class, args);
    }
}
