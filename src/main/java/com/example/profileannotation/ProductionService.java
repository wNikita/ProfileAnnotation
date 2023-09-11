package com.example.profileannotation;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")
public class ProductionService implements MyService {

    @Override
    public String getMessage() {
        return "This is the Production Service";
    }
}

