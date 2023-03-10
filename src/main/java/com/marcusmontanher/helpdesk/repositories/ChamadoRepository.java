package com.marcusmontanher.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcusmontanher.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
