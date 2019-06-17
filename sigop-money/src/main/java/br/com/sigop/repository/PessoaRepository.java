package br.com.sigop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sigop.beans.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	public Pessoa findOne(Long codigo);
	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
	
}
