package br.com.sigop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigop.beans.Pessoa;
import br.com.sigop.repository.PessoaRepository;

@RestController
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	public List<Pessoa> getPessoas() {
		return pessoaRepository.findAll();
	}
	
}
