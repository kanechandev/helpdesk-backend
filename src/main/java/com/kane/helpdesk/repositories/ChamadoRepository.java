package com.kane.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kane.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
    
}
