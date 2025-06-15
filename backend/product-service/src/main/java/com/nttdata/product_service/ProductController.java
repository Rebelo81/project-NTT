package com.nttdata.product_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @GetMapping
    public List<String> listarProdutos() {
        // TODO: Implementar listagem de produtos
        return Collections.emptyList();
    }

    @PostMapping
    public String criarProduto() {
        // TODO: Implementar criação de produto
        return "Produto criado";
    }

    @GetMapping("/{id}")
    public String consultarProduto(@PathVariable Long id) {
        // TODO: Implementar consulta de produto
        return "Produto " + id;
    }

    @PutMapping("/{id}")
    public String atualizarProduto(@PathVariable Long id) {
        // TODO: Implementar atualização de produto
        return "Produto atualizado " + id;
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {
        // TODO: Implementar deleção de produto
        return "Produto deletado " + id;
    }
} 