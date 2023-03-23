package com.kane.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kane.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
    
}
