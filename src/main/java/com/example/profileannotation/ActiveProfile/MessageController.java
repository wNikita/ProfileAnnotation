package com.example.profileannotation.ActiveProfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;


    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Received message: " + messageService.getMessage();
    }
}

