package com.example.bookshop;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamplesApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SamplesApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
