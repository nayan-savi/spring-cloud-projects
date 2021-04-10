package com.config.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableConfigServer
public class ConfigCloudServerGithubApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigCloudServerGithubApplication.class, args);
    }


}
