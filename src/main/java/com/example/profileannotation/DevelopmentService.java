package com.example.profileannotation;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("development")
public class DevelopmentService implements MyService {

    @Override
    public String getMessage() {
        return "This is the Development Service";
    }
}

