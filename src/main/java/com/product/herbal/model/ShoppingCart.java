package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter @Getter
@Table(name = "shopping_cart")
@AllArgsConstructor @NoArgsConstructor
public class ShoppingCart {

    @Id
    @Column(name = "shopping_cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID shoppingCartId;

    /*
    @ManyToOne
    private Customer customer; // Customer owning this cart

    @OneToMany(mappedBy = "cart")
    private List<CartItem> items; // Items in the shopping cart
     */
}
