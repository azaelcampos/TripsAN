package com.trips.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trips.models.Trip;

@Service
public class TripServiceImpl implements ITripServices {
	
	List<Trip> lista = null;
	
	public TripServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		
		lista = new LinkedList<Trip>();
		
		try {
			Trip trip1 = new Trip();
			trip1.setId(1);
			trip1.setNombre("Rapel en Volcatenango");
			trip1.setDescripcion("Hacer rapel en los circuitos en Volcatenango");
			trip1.setFecha(sdf.parse("10-05-2022"));
			trip1.setCosto(5.0);
			trip1.setDestacado(1);
			trip1.setImagen("trip01.png");
			
			Trip trip2 = new Trip();
			trip2.setId(2);
			trip2.setNombre("Deslizadero en El Picnic");
			trip2.setDescripcion("Deslizarse en un divertido tobogan sobre la colina");
			trip2.setFecha(sdf.parse("10-05-2022"));
			trip2.setCosto(5.0);
			trip2.setDestacado(1);
			trip2.setImagen("trip02.png");
			
			Trip trip3 = new Trip();
			trip3.setId(3);
			trip3.setNombre("Comida y Flores");
			trip3.setDescripcion("Disfrutar de un amplio jardin el cual podras comprar");
			trip3.setFecha(sdf.parse("10-05-2022"));
			trip3.setCosto(1.0);
			trip3.setDestacado(2);
			trip3.setImagen("tirp03.png");
			
			Trip trip4 = new Trip();
			trip4.setId(4);
			trip4.setNombre("Caminatas");
			trip4.setDescripcion("Disfrutar hacer senderismo por las montañas chalatecas");
			trip4.setFecha(sdf.parse("01-02-2022"));
			trip4.setCosto(10.0);
			trip4.setDestacado(1);
			trip4.setImagen("no-image.png");
			
			lista.add(trip1);
			lista.add(trip2);
			lista.add(trip3);
			lista.add(trip4);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	@Override
	public List<Trip> buscarTodo() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	@Override
	public Trip buscarPorId(Integer idTrip){
		for (Trip trip : lista)
			if (trip.getId()==idTrip)
				return trip;
		return null;
	}

}
