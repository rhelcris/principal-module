package br.com.sigop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigop.beans.Lancamento;
import br.com.sigop.repository.queries.LancamentoRepositoryQuery;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
