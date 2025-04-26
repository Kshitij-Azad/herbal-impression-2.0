package com.product.herbal.core.repository;

import com.product.herbal.core.dto.ProductDTO;
import com.product.herbal.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
