package com.api.learning_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.learning_api.database.model.ProductEntity;
import com.api.learning_api.dto.ProductDto;
import com.api.learning_api.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import lombok.RequiredArgsConstructor;





@RestController 
@RequestMapping("/produtos") 
// @RequiredArgsConstructor 
public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService produtoService) {
        this.productService = produtoService;
    }
    
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK) 
    public List<ProductEntity> getAll(){
        return productService.findAll();
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity createProduct(@RequestBody ProductDto productDto){
        return productService.creatProduct(productDto);
    }
     
    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity editProduct(@RequestBody ProductDto productDto, @PathVariable Integer id){
        return productService.editProduct(productDto, id);
    }

}
