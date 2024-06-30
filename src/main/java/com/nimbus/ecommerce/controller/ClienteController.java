package com.nimbus.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbus.ecommerce.entity.Cliente;
import com.nimbus.ecommerce.service.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Rotas Públicas
    @PostMapping("/cadastro")
    public Cliente cadastro(@Valid @RequestBody Cliente cliente) {
        // verificar se nenhum dado está em branco
        // criptografar senha, telefone
        // salvar e retornar objeto cliente
        return clienteService.create(cliente);
    }

}
