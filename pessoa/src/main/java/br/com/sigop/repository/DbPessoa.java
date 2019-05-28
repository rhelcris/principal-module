//package br.com.sigop.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import br.com.sigop.beans.Pessoa;
//
//@Component
//public class DbPessoa implements CommandLineRunner  {
//
//	@Autowired
//	private PessoaRepository pessoaRepository;
//	
//	@Override
//	public void run(String... arg0) throws Exception {
//		Pessoa rhelcris = new Pessoa("Rhelcris", "94991908796");
//		Pessoa raimunda = new Pessoa("Ray Marreiro", "94991908796");
//		Pessoa joaoCris = new Pessoa("João Cris", "94991901360");
//		
//		List<Pessoa> pessoas = new ArrayList<>();
//		pessoas.add(rhelcris);
//		pessoas.add(raimunda);
//		pessoas.add(joaoCris);
//		
//		pessoaRepository.save(pessoas);
//	}
//
//}
