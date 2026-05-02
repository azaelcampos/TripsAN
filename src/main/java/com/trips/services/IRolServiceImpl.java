package com.trips.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trips.models.Rol;

@Service
public class IRolServiceImpl implements IRolService {

	List<Rol> lista = null;
	
	public IRolServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		lista = new LinkedList<Rol>();
		try {
			Rol r1 = new Rol();
			r1.setId(1);
			r1.setNomRol("Vendedor");
			r1.setDescripcion("Venta de productos electronicos");
			r1.setActivo(true);
			r1.setFechaCreacion(sdf.parse("14/04/2023"));
			
			Rol r2 = new Rol();
			r2.setId(2);
			r2.setNomRol("Visitante");
			r2.setDescripcion("Visitante de tienda electronica");
			r2.setActivo(true);
			r2.setFechaCreacion(sdf.parse("20/06/2023"));
			
			Rol r3 = new Rol();
			r3.setId(3);
			r3.setNomRol("Comprador");
			r3.setDescripcion("Comprador de los productos de la tienda");
			r3.setActivo(true);
			r3.setFechaCreacion(sdf.parse("24/06/2023"));
			
			lista.add(r1);
			lista.add(r2);
			lista.add(r3);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public List<Rol> buscarTodo() {
		return lista;
	}
	
	@Override
	public Rol buscarPorId(Integer idRol) {
		for (Rol rol : lista) {
			if (rol.getId() == idRol) {
				return rol;
			}
		}
		return null;
	}

}
