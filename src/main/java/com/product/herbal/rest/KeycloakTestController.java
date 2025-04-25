package com.product.herbal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeycloakTestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint accessible without login.";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "This is an admin-only endpoint that requires login.";
    }
}
