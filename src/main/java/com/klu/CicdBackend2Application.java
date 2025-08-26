package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CicdBackend2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CicdBackend2Application.class, args);
    }

    // This is required for WAR deployment in external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CicdBackend2Application.class);
    }
}
