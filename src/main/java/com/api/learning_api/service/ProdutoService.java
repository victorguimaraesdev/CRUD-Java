package com.api.learning_api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.learning_api.database.model.ProdutoEntity;

@Service 
public class ProdutoService {
    private static final List<ProdutoEntity> PRODUTOS = List.of(
        ProdutoEntity.builder()
            .id(1)
            .nome("Banana")
            .preco(new BigDecimal(700))
            .quantidade(10)
        .build(),
        ProdutoEntity.builder()
            .id(2)
            .nome("Manga")
            .preco(new BigDecimal(500))
            .quantidade(8)
       . build(),
        ProdutoEntity.builder()
            .id(3)
            .nome("VTMSFD")
            .preco(new BigDecimal(300))
            .quantidade(20)
        .build()
    );

    public List<ProdutoEntity> findAll() {
        return new ArrayList<ProdutoEntity>(PRODUTOS);
    };
}
