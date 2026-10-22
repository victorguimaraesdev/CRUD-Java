package com.api.learning_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.learning_api.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.api.learning_api.database.model.ProdutoEntity;


@RestController 
@RequestMapping("/produtos") 
public class ProdutosController {
    
    @Autowired 
    private ProdutoService produtoService;

    public ProdutosController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    
    @GetMapping("path")
    @ResponseStatus(HttpStatus.OK) 
    public List<ProdutoEntity> getAll(){
        return produtoService.findAll();
    }

}
