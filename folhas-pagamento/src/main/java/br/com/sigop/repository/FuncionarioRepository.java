package br.com.sigop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigop.beans.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
