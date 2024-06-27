package com.nimbus.ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nimbus.ecommerce.entity.Cliente;
import com.nimbus.ecommerce.repository.ClienteRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
@Transactional
@Validated
public class ClienteService {

    private ClienteRepository clienteConnection;

    public ClienteService (ClienteRepository clienteRepository) {
        this.clienteConnection = clienteRepository;
    }

    public Cliente create(@Valid Cliente cliente) {
        return clienteConnection.save(cliente);
    }

}
