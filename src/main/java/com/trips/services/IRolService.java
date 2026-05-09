package com.trips.services;

import java.util.List;

import com.trips.models.Rol;

public interface IRolService {
	
	List<Rol> buscarTodo();
	Rol buscarPorId(Integer idRol);
}
