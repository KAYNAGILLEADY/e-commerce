package com.nimbus.ecommerce.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping
    public List<Cliente> list(){
        
        return clienteService.list();

    }

    @DeleteMapping("{id}")
    
    public List<Cliente> delete(@PathVariable("id") UUID id){
        return clienteService.delete(id);
    } 

}
