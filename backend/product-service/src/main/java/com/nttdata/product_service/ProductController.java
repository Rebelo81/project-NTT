package com.nttdata.product_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    private final ProdutoService service;

    public ProductController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return service.listarTodos();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping("/{id}")
    public Produto consultarProduto(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto existente = service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        existente.setNome(produto.getNome());
        existente.setDescricao(produto.getDescricao());
        existente.setPreco(produto.getPreco());
        return service.salvar(existente);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        service.deletar(id);
    }
} 