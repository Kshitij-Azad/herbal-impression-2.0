package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "product_review")
@AllArgsConstructor @NoArgsConstructor
public class ProductReview{

    @Id
    @Column(name = "product_review_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productReviewId;

    @Column(name = "review_text")
    private String reviewText;

    @Column(name = "rating")
    private int rating;

    @Column(name = "customer_name")
    private String customerName;
    /*
    @ManyToOne
    private Product product;

    @ManyToOne
    private Customer customer;
     */
}
