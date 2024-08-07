package com.nimbus.ecommerce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Sort;
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


    public List<Cliente> list(){

        return clienteConnection.findAll(Sort.by(Sort.Direction.ASC, "nome"));

    }

    public List<Cliente> delete(UUID id){

        if(clienteConnection.existsById(id)){
            clienteConnection.deleteById(id);
        }else {
            throw new IllegalArgumentException("Cliente com o ID " + id + " não encontrado.");
        }

        return list();

    }

}
