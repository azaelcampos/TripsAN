package com.trips.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.trips.models.Rol;
import com.trips.services.IRolService;

@Controller	
public class RolController {
	
	@Autowired
	private IRolService service;
	
	
	@GetMapping("/tablarol")
	public String mostrarTabla(Model model) {
		List<Rol> lista = service.buscarTodo();
		model.addAttribute("roles", lista);
		return "tablarol";
	}
}