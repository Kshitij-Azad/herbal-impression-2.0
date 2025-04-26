package com.product.herbal.core.service;

import com.product.herbal.core.dto.ProductDTO;
import com.product.herbal.model.Product;

public interface ProductService {

    Product createProduct (ProductDTO product);
}
