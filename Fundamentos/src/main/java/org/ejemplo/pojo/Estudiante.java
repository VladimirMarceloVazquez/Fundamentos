package org.ejemplo.pojo;
/*
 * POJO: PLAIN OLDER JAVA OBJECT
 * 
 * REPOSITORIO DE DATOS
 * 
 * GET = OBTENER
 * 
 * SET = ASIGNAR
 * 
 * 1. VARIABLES ENCAPSULADAS(private) Y DEBEN SER MIEMBROS DE LA CLASE (GLOBALES)
 * 2. TODAS LAS VARIABLES DEBEN TENER SU METODO GET Y SET.
 * */
public class Estudiante {

	private int id;
	private String nombre;
	private double apoyo;
	private String grado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getApoyo() {
		return apoyo;
	}
	public void setApoyo(double apoyo) {
		this.apoyo = apoyo;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
}


