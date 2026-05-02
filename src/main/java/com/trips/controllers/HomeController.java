package com.trips.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trips.models.Trip;
import com.trips.services.ITripServices;

@Controller
public class HomeController {
	
	@Autowired
	private ITripServices tripServices;
	
	@GetMapping("/homre")
	public String mostrarHomre(Model model) {
		
		model.addAttribute("mensaje", "hola mundo");
		return "homre";
	}
	
	@GetMapping("/homle")
	public String mostrarHomle (Model model) {
	    
	    String trip = "Rapel en Volcatenango";
	    Date fechaPublicacion = new Date();
	    double costo = 5.0;
	    boolean vigente = true;
	    
	    model.addAttribute("trip", trip);
	    model.addAttribute("fechaPublicacion", fechaPublicacion);
	    model.addAttribute("costo", costo);
	    model.addAttribute("vigente", vigente);
	    
	    return "homle";
	}
	
	@GetMapping("/home")
	public String mostrarHome(Model model) {
		
		List<Trip> lista = tripServices.buscarTodo();
		model.addAttribute("trips", lista);
		return "home";
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
	
	
	@GetMapping ("/tabla")
	public String mostrarTabla(Model model) {
		List<Trip> lista = tripServices.buscarTodo();	
		model.addAttribute("trips", lista);
		return "tabla";
	}
	
	@GetMapping("/hompe")
	public String mostrarHompe (Model model) {
		
		model.addAttribute("mensaje", "Bienvenidos a la aplicacion");
		model.addAttribute("mensaje2", "Categorias de productos");
		model.addAttribute("fecha", new Date());
		return "hompe";
	}

}
