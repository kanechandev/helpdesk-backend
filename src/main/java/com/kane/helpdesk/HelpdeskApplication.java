package com.kane.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kane.helpdesk.domain.Chamado;
import com.kane.helpdesk.domain.Cliente;
import com.kane.helpdesk.domain.Tecnico;
import com.kane.helpdesk.domain.enums.Perfil;
import com.kane.helpdesk.domain.enums.Prioridade;
import com.kane.helpdesk.domain.enums.Status;
import com.kane.helpdesk.repositories.ChamadoRepository;
import com.kane.helpdesk.repositories.ClienteRepository;
import com.kane.helpdesk.repositories.TecnicoRepository;


@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Kane San", "04241872975", "kane@kane.com.br", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Shein", "01465214210", "shein@shein.com", "123");

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));

	}

}
