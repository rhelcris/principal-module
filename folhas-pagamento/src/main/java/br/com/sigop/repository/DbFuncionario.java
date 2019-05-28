//package br.com.sigop.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import br.com.sigop.beans.Funcionario;
//
//@Component
//public class DbFuncionario implements CommandLineRunner  {
//
//	@Autowired
//	private FuncionarioRepository funcionarioRepository;
//	
//	@Override
//	public void run(String... arg0) throws Exception {
//		Funcionario rhelcris = new Funcionario("Rhelcris", "94991908796", "INFORMATICA", "PROGRAMADOR", 3500.0);
//
//		Funcionario raimunda = new Funcionario("Raimunda", "94991679491", "DPTO CONTABIL", "Contadora", 5000.0);
//		
//		Funcionario joaoCris = new Funcionario("João Cris", "94991901360", "OBRAS", "Construtors", 15000.0);
//		
//		
//		List<Funcionario> funcionarios = new ArrayList<>();
//		funcionarios.add(rhelcris);
//		funcionarios.add(raimunda);
//		funcionarios.add(joaoCris);
//		
//		funcionarioRepository.save(funcionarios);
//	}
//
//}
