package com.api.learning_api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.learning_api.database.model.ProductEntity;
import com.api.learning_api.dto.ProductDto;

@Service
public class ProductService {
    private static final List<ProductEntity> PRODUCTS = new ArrayList<>();

    static {
        PRODUCTS.add(ProductEntity.builder()
                .id(1)
                .nome("Banana")
                .preco(new BigDecimal(700))
                .quantidade(10)
                .build());
        PRODUCTS.add(ProductEntity.builder()
                .id(2)
                .nome("Manga")
                .preco(new BigDecimal(500))
                .quantidade(8)
                .build());
        PRODUCTS.add(ProductEntity.builder()
                .id(3)
                .nome("VTMSFD")
                .preco(new BigDecimal(300))
                .quantidade(20)
                .build());
    }

    public List<ProductEntity> findAll() {
        return new ArrayList<ProductEntity>(PRODUCTS);
    };

    public ProductEntity creatProduct(ProductDto productDto) {

        Integer identifier = PRODUCTS.stream().mapToInt(ProductEntity::getId).max().orElse(0) + 1;

        ProductEntity newProduct = ProductEntity.builder()
                .id(identifier)
                .nome(productDto.getNome())
                .preco(productDto.getPreco())
                .quantidade(productDto.getQuantidade())
                .build();

        PRODUCTS.add(newProduct);

        return newProduct;
    };

}
