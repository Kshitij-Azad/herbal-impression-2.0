package com.product.herbal.core.domain;

import com.product.herbal.model.Product;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductResponse {

    private String status;
    private List<Product> products;
    private String message;

}
