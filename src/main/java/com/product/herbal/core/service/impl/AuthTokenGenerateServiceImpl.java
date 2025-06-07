package com.product.herbal.core.service.impl;

import com.product.herbal.core.domain.AuthTokenGenerateResponse;
import com.product.herbal.core.service.AuthTokenGenerateService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthTokenGenerateServiceImpl implements AuthTokenGenerateService {

    @Value("${oauth2.token.url}")
    String keycloakTokenUrl;

    @Override
    public AuthTokenGenerateResponse fetchAndModifyToken(String client_id, String client_secret, String username, String password, String grant_type, String scope) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("client_id", client_id);
        map.add("client_secret", client_secret);
        map.add("username", username);
        map.add("password", password);
        map.add("grant_type", grant_type);
        if (scope != null && !scope.isEmpty()) {
            map.add("scope", scope);
        }
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> keycloakResponse = restTemplate.postForEntity(keycloakTokenUrl, request, String.class);
        return genrateAuthTokenGenerateResponse(keycloakResponse);
    }

    private static AuthTokenGenerateResponse genrateAuthTokenGenerateResponse(ResponseEntity<String> response) {
        AuthTokenGenerateResponse tokenGenerateResponse = new AuthTokenGenerateResponse();
        JSONObject tokenResponse = new JSONObject(response.getBody());
        tokenGenerateResponse.setAccess_token(tokenResponse.getString("access_token"));
        tokenGenerateResponse.setExpires_in(tokenResponse.getInt("expires_in"));
        tokenGenerateResponse.setMessage("Token fetched successfully!");
        return tokenGenerateResponse;
    }
}
