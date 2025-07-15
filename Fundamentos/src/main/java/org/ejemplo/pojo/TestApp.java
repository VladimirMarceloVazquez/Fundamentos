package org.ejemplo.pojo;

public class TestApp {

	public static void main(String[] args) {
		//INSTANCIA DE LA CLASE
		Estudiante estudiante = new Estudiante();
		//ASIGNAR DATOS
		estudiante.setId(199);
		estudiante.setNombre(" TOÑO MARTINEZ LOPEZ");
		estudiante.setApoyo(2000);
		estudiante.setGrado(" 9° semestre");
		
		//OBTENER LOS DATOS = GET
		System.out.println(estudiante.getId()+","+
		estudiante.getNombre()+","+estudiante.getApoyo()+","+
				estudiante.getGrado());
	}
}
