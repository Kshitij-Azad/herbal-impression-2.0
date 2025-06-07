package com.product.herbal.model;

import com.product.herbal.core.constants.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "`order`")
@NoArgsConstructor @AllArgsConstructor
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID orderId;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "status")
    private Status status;

    /*
    @ManyToOne
    private Customer customer; // The customer who placed the order

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems; // Items in this order

     */
}
