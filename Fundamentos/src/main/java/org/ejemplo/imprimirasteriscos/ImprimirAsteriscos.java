package org.ejemplo.imprimirasteriscos;

public class ImprimirAsteriscos {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*"); //Imprime eso mientras se cumpla el for
		    }
		    System.out.println();
		}
	}
}
