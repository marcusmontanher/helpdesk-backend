package com.marcusmontanher.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcusmontanher.helpdesk.domain.Chamado;
import com.marcusmontanher.helpdesk.domain.Cliente;
import com.marcusmontanher.helpdesk.domain.Tecnico;
import com.marcusmontanher.helpdesk.domain.enums.Perfil;
import com.marcusmontanher.helpdesk.domain.enums.Prioridade;
import com.marcusmontanher.helpdesk.domain.enums.Status;
import com.marcusmontanher.helpdesk.repositories.ChamadoRepository;
import com.marcusmontanher.helpdesk.repositories.ClienteRepository;
import com.marcusmontanher.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Marcus Montanher", "43305812800", "marcusmontanher@hotmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
