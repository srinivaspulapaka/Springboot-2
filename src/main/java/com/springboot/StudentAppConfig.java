package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pulapakas on 27-02-2017.
 */


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.springboot"})
public class StudentAppConfig {
    public static void main(String[] args) {

        SpringApplication.run(StudentAppConfig.class, args);
    }
}
