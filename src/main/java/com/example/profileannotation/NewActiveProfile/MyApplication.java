package com.example.profileannotation.NewActiveProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyApplication.class);

        // Set the active profile
        application.setAdditionalProfiles("development");

        application.run(args);
    }
}
