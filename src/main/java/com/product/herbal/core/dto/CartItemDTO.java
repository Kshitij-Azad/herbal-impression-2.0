package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CartItemDTO {

    @JsonProperty(namespace = "cart_id")
    private UUID cartId;

    @JsonProperty(namespace = "quantity")
    private int quantity;

    @JsonProperty(namespace = "price_at_cart")
    private double priceAtCart;

}
