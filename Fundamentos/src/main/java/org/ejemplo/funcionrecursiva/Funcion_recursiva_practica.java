package org.ejemplo.funcionrecursiva;

public class Funcion_recursiva_practica {
	// Función recursiva para calcular el factorial
	static int factorial(int n) {
		if (n == 0) { // Caso Base, si el numero dato es 0
			return 1;
		} else {
			return n * factorial(n - 1); // Caso recursivo
			//Multiplica n por el factorial -1
		}
	}

	public static void main(String[] args) {
		int numero = 5;
		//int numero = 0;
		int resultado = factorial(numero);
		System.out.println("El factorial de " + numero + " es: " + resultado);
	}
}
