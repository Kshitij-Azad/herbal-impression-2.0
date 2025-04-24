package com.product.herbal.core.service;

import org.json.JSONObject;

public interface AuthTokenGenerateService {

    JSONObject fetchAndModifyToken(String client_id, String client_secret, String username, String password, String grant_type, String scope);
}
