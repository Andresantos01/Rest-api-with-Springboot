package com.guaxinim.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guaxinim.api.model.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {
    
}
