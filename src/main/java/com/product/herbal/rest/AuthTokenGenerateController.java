package com.product.herbal.rest;

import com.product.herbal.core.domain.AuthTokenGenerateResponse;
import com.product.herbal.core.service.AuthTokenGenerateService;
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
    public ResponseEntity<AuthTokenGenerateResponse> getToken(@RequestParam String client_id, @RequestParam String client_secret, @RequestParam String username, @RequestParam String password,
                                                              @RequestParam String grant_type, @RequestParam String scope) {
        try {
            AuthTokenGenerateResponse modifiedResponse = authtokenGenerateService.fetchAndModifyToken(client_id, client_secret, username, password, grant_type, scope);
            return new ResponseEntity<>(modifiedResponse,HttpStatus.OK);
        } catch (Exception e) {
            AuthTokenGenerateResponse authTokenGenerateResponse = new AuthTokenGenerateResponse();
            authTokenGenerateResponse.setAccess_token("INVALID TOKEN");
            authTokenGenerateResponse.setExpires_in(0);
            authTokenGenerateResponse.setMessage("Error processing token: " + e.getMessage());
            return new ResponseEntity<>(authTokenGenerateResponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
