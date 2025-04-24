package com.product.herbal.core.rest;

import com.product.herbal.core.service.AuthTokenGenerateService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthTokenGenerateController {

    @Autowired
    private AuthTokenGenerateService authtokenGenerateService;

    @PostMapping("/token")
    public ResponseEntity<String> getToken(@RequestParam String client_id, @RequestParam String client_secret, @RequestParam String username, @RequestParam String password,
                                      @RequestParam String grant_type, @RequestParam String scope) {
        try {
            JSONObject modifiedResponse = authtokenGenerateService.fetchAndModifyToken(client_id, client_secret, username, password, grant_type, scope);

            return new ResponseEntity<>(modifiedResponse.toString(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error processing token: " + e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
