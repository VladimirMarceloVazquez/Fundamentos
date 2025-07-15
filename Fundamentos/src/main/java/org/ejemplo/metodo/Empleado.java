package org.ejemplo.metodo;

public class Empleado {
	
	private int id;
	private String nombre;
	private String apepat;
	private double salario;
	
	//CONSTRUCTORES DE LA CLASE
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	//SOBRECARGA: PORQUE RECIBE AL MENOS 1 PARAMETRO
	public Empleado(int id) {
		super();
		this.id = id;
	}
	//SOBRECARGA: PORQUE RECIBE AL MENOS 1 PARAMETRO
	//SOBREESCRITURA: PORQUE EXISTEN 2 METODOS CON EL MISMO PARAMETRO Y TIPO.
	public Empleado(int id, String nombre, String apepat, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apepat = apepat;
		this.salario = salario;
	}	
	/*
	 * ¿CUAL ES LA DIFERENCIA ENTRE UN METODO VOID Y STATIC VOID?
	 * */
	public void imprimirNombreEmpleado() {
		System.out.println("JUAN PEREZ LOPEZ");
	}
	public static void imprimirCurpEmpleado() {
		System.out.println("AMMA281212MN");
	}
	public static void main (String[] args) {
	//EL METODO VOID NECESITA INSTANCIAR LA CLASE PARA SER LLAMADO
		Empleado empleado = new Empleado();
		empleado.imprimirNombreEmpleado();
		
	//EL METODO STATIC VOID NO NECESITA CREAR INSTANCIAS.
		imprimirCurpEmpleado();
	}
	
}
