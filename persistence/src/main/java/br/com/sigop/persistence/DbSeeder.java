package br.com.sigop.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.sigop.domain.Hotel;

@Component
public class DbSeeder implements CommandLineRunner  {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		Hotel estrela = new Hotel("Hotel Estrela", 5, true);
		Hotel ibis = new Hotel("IBIS Hotel", 4, false);
		Hotel tollip = new Hotel("Tollip Hotel", 3 , true);
		
		List<Hotel> hotels = new ArrayList<>();
		hotels.add(estrela);
		hotels.add(ibis);
		hotels.add(tollip);
		
		hotelRepository.save(hotels);
	}

}
