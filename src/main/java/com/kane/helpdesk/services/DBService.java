package com.kane.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kane.helpdesk.domain.Chamado;
import com.kane.helpdesk.domain.Cliente;
import com.kane.helpdesk.domain.Tecnico;
import com.kane.helpdesk.domain.enums.Perfil;
import com.kane.helpdesk.domain.enums.Prioridade;
import com.kane.helpdesk.domain.enums.Status;
import com.kane.helpdesk.repositories.ChamadoRepository;
import com.kane.helpdesk.repositories.ClienteRepository;
import com.kane.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

    @Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
    
    public void instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Kane San", "052.421.729-75", "kane@kane.com.br", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Shein", "333.178.020-06", "shein@shein.com", "123");

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		Tecnico tec2 = new Tecnico(null, "Tec San", "711.810.760-30", "tec@kane.com.br", "123");
		tec1.addPerfil(Perfil.ADMIN);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
    }
}
