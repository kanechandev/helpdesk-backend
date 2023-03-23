package com.kane.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kane.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    
}
