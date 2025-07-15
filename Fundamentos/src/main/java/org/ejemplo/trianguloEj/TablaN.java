package org.ejemplo.trianguloEj;

public class TablaN {
public static void main(String[] args) {
	int n = 2; //Valor a multiplicar
	System.out.println("n= "+n);
	for (int i = 1; i <= 10; i++) { //Mientras i (que vale 1) sea igual o menor a 10, sumara +1
	    int resultado = n * i; //Multiplico el valor de n por i
	    
	    System.out.println(+ n + " x " + i + " = " + resultado);
	}
}
}
