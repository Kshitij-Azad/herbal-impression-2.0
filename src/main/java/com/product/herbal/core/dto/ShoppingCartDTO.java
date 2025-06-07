package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class ShoppingCartDTO {

    @JsonProperty(namespace = "shopping_cart_id")
    private UUID shoppingCartId;

}
