package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "category")
@AllArgsConstructor @NoArgsConstructor
public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID categoryId;

    @Column(name = "category_name")
    private String categoryName;

    /*
    @OneToMany(mappedBy = "category")
    private List<Product> products; // Products under this category
     */
}
