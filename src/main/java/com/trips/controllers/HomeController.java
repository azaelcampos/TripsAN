package com.trips.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trips.models.Trip;

@Controller
public class HomeController {
	
	@GetMapping("/homre")
	public String mostrarHomre(Model model) {
		
		model.addAttribute("mensaje", "hola mundo");
		return "homre";
	}
	
	@GetMapping("/home")
	public String mostrarHome (Model model) {
		
		model.addAttribute("mensaje", "Bienvenidos a la aplicacion");
		model.addAttribute("mensaje2", "Categorias de productos");
		model.addAttribute("fecha", new Date());
		return "home";
	}
	
	@GetMapping("/homle")
	public String mostrarHomle(Model model) {
		
		String trip = "Rapel en el Volcan";
		Date fechaPublicacion = new Date();
		double costo = 5.0;
		boolean vigente = true;
		
		model.addAttribute("trip", trip);
		model.addAttribute("fechaPublicacion", fechaPublicacion);
		model.addAttribute("costo", costo);
		model.addAttribute("vigente", vigente);
		return "homle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("En la montaña");
		lista.add("En la ciudad");
		lista.add("En los pueblos");
		lista.add("En las playas");
		
		model.addAttribute("listadoTrips", lista);
		
		return "listado";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Trip trip = new Trip();
		trip.setNombre("Rapel en Volcatenango");
		trip.setDescripcion("Aventa rapel en un circuito conectado en las ...");
		trip.setFecha(new Date());
		trip.setCosto(10.0);
		model.addAttribute("trip", trip);
		
		return "detalle";
	}
	
	private List<Trip> getTrips(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		List<Trip> lista = new LinkedList<Trip>();
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
		return lista;
	}
	
	@GetMapping ("/tabla")
	public String mostrarTabla(Model model) {
		List<Trip> lista = getTrips();
		model.addAttribute("trips", lista);
		return "tabla";
	}

}
