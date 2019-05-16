package br.com.sigop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigop.beans.Funcionario;
import br.com.sigop.repository.FuncionarioRepository;

@RestController
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> getFuncionarios() {
		return funcionarioRepository.findAll();
	}
}
