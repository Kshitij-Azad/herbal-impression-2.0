package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CustomerDTO {

    @JsonProperty(namespace = "customer_id")
    private UUID customerId;

    @JsonProperty(namespace = "first_name")
    private String firstName;

    @JsonProperty(namespace = "last_name")
    private String lastName;

    @JsonProperty(namespace = "email")
    private String email;

    @JsonProperty(namespace = "password")
    private String password;

    @JsonProperty(namespace = "phone_number")
    private String phoneNumber;

    @JsonProperty(namespace = "shipping_address")
    private String shippingAddress;

}
