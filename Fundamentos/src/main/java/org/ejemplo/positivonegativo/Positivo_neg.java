package org.ejemplo.positivonegativo;

import java.util.Scanner;

public class Positivo_neg {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Escribe un número: ");
			int numero = scanner.nextInt();
			if (numero >= 1) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El número es negativo");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
