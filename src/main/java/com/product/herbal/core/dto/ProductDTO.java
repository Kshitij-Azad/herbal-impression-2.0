package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ProductDTO {

//    @JsonProperty(namespace = "product_id")
//    private UUID productId;

    @JsonProperty(namespace = "product_name")
    private String productName;

    @JsonProperty(namespace = "description")
    private String description;

    @JsonProperty(namespace = "price")
    private int price;

    @JsonProperty(namespace = "product_image")
    private String productImage;

    @JsonProperty(namespace = "stockQuantity")
    private int stockQuantity;

    @JsonProperty(namespace = "brand")
    private String brand;

    @JsonProperty(namespace = "status")
    private boolean isActive;

}
