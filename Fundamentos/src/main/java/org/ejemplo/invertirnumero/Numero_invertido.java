package org.ejemplo.invertirnumero;

import java.util.Scanner;

public class Numero_invertido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero de 4 caracteres: ");
		String numero = sc.nextLine();
		
		String primeraparte = numero.substring(0,1);
		String segundaparte = numero.substring(1,2);
		String terceraparte = numero.substring(2,3);
		String cuartapate = numero.substring(3,4);
		
		String numero_invertido = cuartapate + terceraparte + segundaparte + 
				primeraparte;
		
		System.out.println("1ra forma. Tu numero en orden invertido es: " + 
		numero_invertido);
		
		//Segunda forma
		
		//StringBuilder es una clase especial en Java que 
		//se usa para construir y modificar cadenas de texto
		
		StringBuilder sb = new StringBuilder(numero);
        String invertido = sb.reverse().toString();

        System.out.println("Número invertido con StringBuilder: " + invertido);
		
        
        //Tercera forma
        //Usar For
        String invertidofor = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            invertidofor += numero.charAt(i); // Agrega los caracteres al revés
        }

        System.out.println("Número invertido con FOR: " + invertidofor);
	}
}
