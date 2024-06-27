package com.nimbus.ecommerce.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbus.ecommerce.entity.Cliente;
import com.nimbus.ecommerce.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    } 

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.create(cliente);
    }

}
