package com.nimbus.ecommerce.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    public ResponseEntity<Cliente> cadastro(@Valid @RequestBody Cliente cliente) {
        // salvar e retornar objeto cliente
        return ResponseEntity.ok(clienteService.create(cliente));
    }

    // public ResponseEntity<Boolean> login(
    //     @RequestBody String login,
    //     @RequestBody String password
    // ) {
    //     Optional<Cliente> optCliente = 

    //     return null;
    // }
}
