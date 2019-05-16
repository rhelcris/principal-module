package br.com.sigop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigop.domain.Hotel;
import br.com.sigop.persistence.HotelRepository;

@RestController
public class HotelController {

	@Autowired 
	private HotelRepository hotelRepository;
	
	@GetMapping("/hotels")
	public List<Hotel> getHotels() {
		return hotelRepository.findAll();
	}
	
}
