package br.com.sigop.repository.queries;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.sigop.beans.Lancamento;
import br.com.sigop.repository.filter.LancamentoFilter;
import br.com.sigop.repository.projection.ResumoLancamento;


public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
//	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable); 
	
}
