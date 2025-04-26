package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "cart_item")
@NoArgsConstructor @AllArgsConstructor
public class CartItem {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cartId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price_at_cart")
    private double priceAtCart;

    /*
    @ManyToOne
    private ShoppingCart cart; // The cart this item belongs to

    @ManyToOne
    private Product product; // The product added to the cart
     */
}
