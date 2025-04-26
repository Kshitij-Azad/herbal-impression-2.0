package com.product.herbal.rest;

import com.product.herbal.core.dto.ProductDTO;
import com.product.herbal.core.service.ProductService;
import com.product.herbal.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO product) {
        Product savedProduct = productService.createProduct(product);
        if (savedProduct == null )
            throw new NullPointerException("Product detail is null");
        return new ResponseEntity<>("Product Add Successfully", HttpStatus.CREATED);
    }

//    @PutMapping
//    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<Product> deleteProduct(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getAllProduct(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getProductById(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getStatusProduct(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> SearchProducts(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getProductPriceRange(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getProductByCategoryId(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<Product> getProductByBrandName(@RequestBody Product product) {
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
}
