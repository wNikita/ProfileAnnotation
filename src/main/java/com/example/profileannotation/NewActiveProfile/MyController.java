package com.example.profileannotation.NewActiveProfile;

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

    @GetMapping("/properties")
    public String getProperties() {
        return "Common Property 1: " + commonProperty1 +
                "\nLocal Property 3: " + localProperty3 +
                "\nProduction Property 5: " + productionProperty5;
    }
}
