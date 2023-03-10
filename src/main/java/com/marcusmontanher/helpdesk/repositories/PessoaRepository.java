package com.marcusmontanher.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcusmontanher.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
