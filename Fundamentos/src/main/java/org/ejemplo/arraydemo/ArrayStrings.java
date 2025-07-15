package org.ejemplo.arraydemo;

public class ArrayStrings {
	public static void main(String[] args) {
		String[] anArray; //Declara un array de String
		anArray = new String[10];
		anArray[0] = "Gato"; //Inicializa el primer elemento
		anArray[1] = "Perro"; //Inicializa el segundo elemento
		anArray[2] = "Leon"; //Inicializa el tercer elemento
		anArray[3] = "Tiburon"; //Inicializa el cuarto elemento
		anArray[4] = "Ñu"; //Inicializa el quinto elemento
		anArray[5] = "Conejo"; //Inicializa el sexto elemento
		anArray[6] = "Araña"; //Inicializa el septimo elemento
		anArray[7] = "Pez"; //Inicializa el octavo elemento
		anArray[8] = "Cucu"; //Inicializa el noveno elemento
		anArray[9] = "Toro"; //Inicializa el decimo elemento
		
		System.out.println("Elemento en el índice 0: "+ anArray[0]);
		System.out.println("Elemento en el índice 1: "+ anArray[1]);
		System.out.println("Elemento en el índice 2: "+ anArray[2]);
		System.out.println("Elemento en el índice 3: "+ anArray[3]);
		System.out.println("Elemento en el índice 4: "+ anArray[4]);
		System.out.println("Elemento en el índice 5: "+ anArray[5]);
		System.out.println("Elemento en el índice 6: "+ anArray[6]);
		System.out.println("Elemento en el índice 7: "+ anArray[7]);
		System.out.println("Elemento en el índice 8: "+ anArray[8]);
		System.out.println("Elemento en el índice 9: "+ anArray[9]);
	}
}
