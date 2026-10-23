package com.api.learning_api.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter 
@Setter 
@Builder  
@AllArgsConstructor 
@NoArgsConstructor
@ToString

public class ProductDto {
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;
}

