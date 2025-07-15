package org.ejemplo.sentencia;

public class ReturnDemo {
public static void main(String[] args) {
	System.out.println("el cubo de 10.5 es = "+calculaCubo(10.5)); //Invocacion metodo calculaCubo
}
	public static double calculaCubo (double x) {
		//Uso de sentencia return
		return x*x*x;
	
}
}
