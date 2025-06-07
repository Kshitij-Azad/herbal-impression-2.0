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
public class ProductReviewDTO {

    @JsonProperty(namespace = "product_review_id")
    private UUID productReviewId;

    @JsonProperty(namespace = "review_text")
    private String reviewText;

    @JsonProperty(namespace = "rating")
    private int rating;

    @JsonProperty(namespace = "customer_name")
    private String customerName;
}
