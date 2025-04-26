package com.product.herbal.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Getter @Setter
@Table(name = "product")
@AllArgsConstructor@ NoArgsConstructor
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "product_image")
    private String productImage;

    @Column(name = "stockQuantity")
    private int stockQuantity;

    @Column(name = "brand")
    private String brand;

    @Column(name = "status")
    private boolean isActive;

    /*
    @ManyToOne
    private Category category; // Reference to the Category entity (if you are using categories)

    @OneToMany(mappedBy = "product")
    private List<ProductReview> reviews; // Product Reviews

    @ManyToOne
    private Discount discount; // Discount applied (if any)
     */
}