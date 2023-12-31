package com.example.profileannotation.NewActiveProfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${common.property1}")
    private String commonProperty1;

    @Value("${local.property3}")
    private String localProperty3;

    @Value("${production.property5}")
    private String productionProperty5;

    @Value("${app.message}")
    private  String developmentProperty;

    @GetMapping("/properties")
    public String getProperties() {
        Logger logger= LoggerFactory.getLogger(MyController.class);
        logger.error("Error from controller....!!!");
        logger.info("Hello i am from Controller");
        logger.warn("Hello i am from warn");
        return "Common Property 1: " + commonProperty1 +
                "\nLocal Property 3: " + localProperty3 +
                "\nProduction Property 5: " + productionProperty5
                +"\n Development Property :"+developmentProperty;
    }

}

