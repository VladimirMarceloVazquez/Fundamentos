package org.ejemplo.sentencia;

public class BreakDemo {
public static void main(String[] args) {
	int[] arrayOfInts = {32, 87, 3, 589, 12, 1076,
			2000, 8, 622, 127 };
	int searchfor = 12;
	int i;
	boolean foundIt = false;
	for (i = 0; i < arrayOfInts.length; i++) {
		if (arrayOfInts[i] == searchfor) {
			foundIt = true;
			break;
		}
	}
	if (foundIt) {
		System.out.println("Encontrado "+searchfor+ " en el índice "+ i);
	}
	else {
		System.out.println(searchfor+" no esta en el array");
	}
	
}
}
