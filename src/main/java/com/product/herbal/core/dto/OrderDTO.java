package com.product.herbal.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.herbal.core.constants.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrderDTO {

    @JsonProperty(namespace = "order_id")
    private UUID orderId;

    @JsonProperty(namespace = "order_date")
    private LocalDate orderDate;

    @JsonProperty(namespace = "total_amount")
    private double totalAmount;

    @JsonProperty(namespace = "status")
    private Status status;

}
