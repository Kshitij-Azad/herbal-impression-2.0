package com.product.herbal.model;


import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "product_list")
@lombok.Builder @lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID product_id;
    private String product_name;
    private String description;
    private int price;
    private String product_image;
    private String category;
    private int stock;
    private String created_at;
    private String updated_at;

}