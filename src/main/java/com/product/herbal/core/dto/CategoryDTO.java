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
public class CategoryDTO {

    @JsonProperty(namespace = "category_id")
    private UUID categoryId;

    @JsonProperty(namespace = "category_name")
    private String categoryName;

}
