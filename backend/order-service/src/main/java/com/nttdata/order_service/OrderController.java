package com.nttdata.order_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/pedidos")
public class OrderController {
    @GetMapping("/simular")
    public String simularPedido() {
        // TODO: Implementar simulação de pedido
        return "Pedido simulado";
    }

    @GetMapping("/produtos")
    public List<String> buscarProdutos() {
        // TODO: Implementar busca de produtos via HTTP
        return Collections.emptyList();
    }
} 