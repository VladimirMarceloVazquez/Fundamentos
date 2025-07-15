package org.ejemplo.curppractica;
import java.util.Scanner;

public class Curp_Practica {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Entrada de los datos
		//toUpperCase por si alguien escribe nombres en minusculas
		System.out.print("Nombre: ");
		String nombre = sc.nextLine().toUpperCase();

		System.out.print("Apellido paterno: ");
		String apellidoPaterno = sc.nextLine().toUpperCase();

		System.out.print("Apellido materno: ");
		String apellidoMaterno = sc.nextLine().toUpperCase();

		System.out.print("Fecha de nacimiento (dd/mm/aa): ");
		String fecha = sc.nextLine();

		// Procesar los datos, como tal extraer caracteres con SUBSTREAM
		//						se corta desde el (inicio, fin)
		String parte1 = apellidoPaterno.substring(0, 2); // 2 letras
		String parte2 = apellidoMaterno.substring(0, 1); // 1 letra
		String parte3 = nombre.substring(0, 1); // 1 letra

		String fechaFormateada = fecha.replace("/", ""); // quitar diagonales de
		//la fecha

		//Uno las tres partes al final
		String codigo = parte1 + parte2 + parte3 + fechaFormateada;

		// Mostrar resultado final
		System.out.println("Código generado: " + codigo);
	}
}
