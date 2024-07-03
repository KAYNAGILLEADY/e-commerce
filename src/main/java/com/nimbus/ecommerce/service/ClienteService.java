package com.nimbus.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nimbus.ecommerce.entity.Cliente;
import com.nimbus.ecommerce.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class ClienteService {

    private ClienteRepository clienteConnection;
    
    @Autowired // Numa próxima refatoração: coloca o encoder como um bean do spring
    private PasswordEncoder encoder; // criptografa

    public ClienteService (ClienteRepository clienteRepository) {
        this.clienteConnection = clienteRepository;
    }

    public Cliente create(Cliente cliente) {
        // criptografar senha, telefone
        String senhaCript = encoder.encode(cliente.getSenha());
        String telefone = encoder.encode(cliente.getTelefone());

        cliente.setSenha(senhaCript);
        cliente.setTelefone(telefone);

        // criando cliente
        return clienteConnection.save(cliente);
    }

    public Cliente findByLogin(String login) {
        return null;
    }
}
