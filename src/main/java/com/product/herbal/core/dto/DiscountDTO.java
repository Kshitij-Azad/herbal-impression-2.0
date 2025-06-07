package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class DiscountDTO {

    @JsonProperty(namespace = "discount_id")
    private UUID discountId;

    @JsonProperty(namespace = "percentage")
    private double percentage;

    @JsonProperty(namespace = "description")
    private String description;

    @JsonProperty(namespace = "startDate")
    private LocalDate startDate;

    @JsonProperty(namespace = "endDate")
    private LocalDate endDate;

}
