package org.ejemplo.excepcionespersona;

public class Persona_excepcion {
	private int edad;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
	    if (edad <= 0) {
	        throw new RuntimeException("La edad debe ser de al menos 1 año.");
	    }
	    this.edad = edad;
	}

	public static void main(String[] args) {
        Persona_excepcion p = new Persona_excepcion();
        try {
            p.setEdad(-5); //Edad mal
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        p.setEdad(25); // edad bien
        System.out.println("Edad establecida: " + p.getEdad());
    }
}
