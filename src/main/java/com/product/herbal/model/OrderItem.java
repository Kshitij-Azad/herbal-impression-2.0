package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "order_item")
@AllArgsConstructor @NoArgsConstructor
public class OrderItem {

    @Id
    @Column(name = "order_item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID orderItemId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price_at_purchase")
    private double priceAtPurchase;
    /*
    @ManyToOne
    private Order order; // The order this item belongs to

    @ManyToOne
    private Product product; // The product being ordered

     */
}
