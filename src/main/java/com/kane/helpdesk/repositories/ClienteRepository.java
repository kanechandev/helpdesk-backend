package com.kane.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kane.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
