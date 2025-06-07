package com.product.herbal.core.service;


import com.product.herbal.core.domain.AuthTokenGenerateResponse;

public interface AuthTokenGenerateService {

    AuthTokenGenerateResponse fetchAndModifyToken(String client_id, String client_secret, String username, String password, String grant_type, String scope);
}
