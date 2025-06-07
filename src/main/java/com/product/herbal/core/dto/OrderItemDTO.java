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
public class OrderItemDTO {

    @JsonProperty(namespace = "order_item_id")
    private UUID orderItemId;

    @JsonProperty(namespace = "quantity")
    private int quantity;

    @JsonProperty(namespace = "price_at_purchase")
    private double priceAtPurchase;

}
