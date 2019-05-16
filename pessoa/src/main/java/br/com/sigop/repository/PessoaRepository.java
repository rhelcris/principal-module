package br.com.sigop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigop.beans.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
