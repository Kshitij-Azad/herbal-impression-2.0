package com.product.herbal.core.domain;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class AuthTokenGenerateResponse {

    private String access_token;
    private int expires_in;
    private String message;

}
