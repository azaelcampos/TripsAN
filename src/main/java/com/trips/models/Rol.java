package com.trips.models;

import java.util.Date;

public class Rol {
	
	private Integer id;
	private String nomRol;
	private String descripcion;
	private boolean activo;
	private Date fechaCreacion;
	
	@Override
	public String toString() {
		return "Rol [id=" + id + ", nomRol=" + nomRol + ", descripcion=" + descripcion + ", activo=" + activo
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomRol() {
		return nomRol;
	}
	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


}
