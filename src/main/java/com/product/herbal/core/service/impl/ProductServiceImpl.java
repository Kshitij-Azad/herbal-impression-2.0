package com.product.herbal.core.service.impl;

import com.product.herbal.core.dto.ProductDTO;
import com.product.herbal.core.mapper.ProductMapper;
import com.product.herbal.core.repository.ProductRepository;
import com.product.herbal.core.service.ProductService;
import com.product.herbal.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository,ProductMapper productMapper){
        this.productRepository = productRepository;
        this.productMapper = productMapper;

    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        if (productDTO.getProductName() == null)
            throw new NullPointerException("Product cannot be null");
        Product product =  productMapper.convertToProduct(productDTO);
        return productRepository.save(product);
    }
}
