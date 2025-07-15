package org.ejemplo.arraydemo;

public class doWhileDemo {
public static void main(String[] args) {
	int count = 1;
	do {
		System.out.println("Número: "+count);
		count++;
	} while (count <= 11);
	
	
	int y = 5;

	// DO-WHILE
	do {
	    System.out.println("DO-WHILE: y es " + y);
	    y++;
	} while (y < 5);
	// Imprime una vez, aunque la condición es falsa desde el principio

}
}
