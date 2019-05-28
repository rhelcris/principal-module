//package br.com.sigop.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.sigop.beans.PessoaOLD;
//import br.com.sigop.repository.PessoaRepositoryOLD;
//
//@RestController
//public class PessoaControllerOLD {
//
//	@Autowired
//	private PessoaRepositoryOLD pessoaRepository;
//	
//	@GetMapping("/pessoas")
//	public List<PessoaOLD> getPessoas() {
//		return pessoaRepository.findAll();
//	}
//	
//}
