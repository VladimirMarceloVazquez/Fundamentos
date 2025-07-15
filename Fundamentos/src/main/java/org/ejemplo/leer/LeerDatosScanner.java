package org.ejemplo.leer;

import java.util.Scanner;

public class LeerDatosScanner {
public static void main(String[] args) {
	try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe id: ");
		int id = scanner.nextInt();
		
		System.out.println("Nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Salario: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Datos leidos: \n" + id + "," + " " + nombre + "," + " " + salario);
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		// TODO: handle exception
	}
}
}
