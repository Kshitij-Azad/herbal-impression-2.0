package com.product.herbal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "discount")
@AllArgsConstructor @NoArgsConstructor
public class Discount {

    @Id
    @Column(name = "discount_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID discountId;

    @Column(name = "percentage")
    private double percentage;

    @Column(name = "description")
    private String description;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    private LocalDate endDate;
    /*
    @OneToMany(mappedBy = "discount")
    private List<Product> products; // Products that this discount applies to
     */
}
