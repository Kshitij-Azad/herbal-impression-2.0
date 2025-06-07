package com.product.herbal.core.mapper;

import com.product.herbal.core.dto.ProductDTO;
import com.product.herbal.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product convertToProduct(ProductDTO productDTO);

    ProductDTO convertToProductDTO(Product product);
}
