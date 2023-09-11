package com.example.profileannotation.ActiveProfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("${app.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
