package com.example.profileannotation.ActiveProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyApplication.class);

        // Programmatically set active profiles
        application.setAdditionalProfiles("development");

        application.run(args);
    }
}

