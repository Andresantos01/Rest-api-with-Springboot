package com.guaxinim.api.controller;

import com.guaxinim.api.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.guaxinim.api.model.Clientes;
import com.guaxinim.api.repository.ClienteRepository;

@RestController
@RequestMapping("/guaxinim")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Clientes> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping    
    public Clientes adicionar(@RequestBody Clientes clientes){
        return clienteRepository.save(clientes);
    }
}
