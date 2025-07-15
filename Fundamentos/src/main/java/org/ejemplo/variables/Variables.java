package org.ejemplo.variables;

/*
 * VARIABLES: PUBLIC, PRIVATE Y PROTECTED
 * 
 * TIPOS DE PRIMITIVOS: int, long, short, double, boolean, byte, char, float
 * 
 * String para las cadenas: NO ES UN TIPO DE DATO, POR QUE SURGE DE UNA CLASE.*/
public class Variables {

	//Variables globales en otros lados
	//VARAIBLES MIEMBROS DE LA CLASE (GLOBALES), TODOS LOS METODOS TIENEN ACCESO A LAS VARIABLES
	public int id; 
	private long volumen; 
	protected short edad;
	double salario;
	boolean pregunta;
	byte file;
	char inicial;
	float iva;
	
	/*METODO PRINCIPAL DE JAVA PARA COMPILAR CLASES es MAIN*/
	//main autocompleta el metodo completo
	public static void main(String[] args) {
	
	//Variable local
	int numero_social = 93993993;
	//SYSO autocompleta la impresion de una linea
	System.out.println("NUMERO SOCIAL: " + numero_social);
	
	}
}