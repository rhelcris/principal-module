package br.com.sigop.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigop.domain.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
