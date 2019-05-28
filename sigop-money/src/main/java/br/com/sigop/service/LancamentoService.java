package br.com.sigop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigop.beans.Lancamento;
import br.com.sigop.beans.Pessoa;
import br.com.sigop.repository.LancamentoRepository;
import br.com.sigop.repository.PessoaRepository;
import br.com.sigop.service.exception.PessoaInativaOuInexistenteException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if( pessoa == null || pessoa.isInativo() ) {
			throw new PessoaInativaOuInexistenteException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
}
