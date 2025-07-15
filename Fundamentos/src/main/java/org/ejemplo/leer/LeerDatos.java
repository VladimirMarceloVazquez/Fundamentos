package org.ejemplo.leer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeerDatos {

	public static void main(String[] args) {
		try {
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Escribe el id: ");
			String id = reader.readLine();
			
			System.out.println("Escribe el nombre: ");
			String nombre = reader.readLine();
			
			System.out.println("Escribe el salario: ");
			String salario = reader.readLine();
			
			System.out.println("Escribe 4 números: ");
			for (int i = 1; i < 5; i++) {
				String numero = reader.readLine();
			}
			
			System.out.println("Datos persona: \n" + id + "\n" + nombre + "\n" + salario);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			// TODO: handle exception
		}
	}
}
