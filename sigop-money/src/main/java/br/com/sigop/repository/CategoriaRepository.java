package br.com.sigop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigop.beans.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
	
}
