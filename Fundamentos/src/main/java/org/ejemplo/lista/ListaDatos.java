package org.ejemplo.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaDatos {
public static void main(String[] args) {
	try {
		//Tipo de collection para almacenar datos en memoria
		//Ventaja, que estos incrementan automaticamente, a diferencia del arrya basico
		List<String> nombres = new ArrayList<String>();
		
		//Agregar
		nombres.add("Juan");
		nombres.add("Pablo");
		nombres.add("Hugo");
		nombres.add("Pedro");
		
		//Modificar
		nombres.set(2, "Juan pedro");
		
		//Eliminar
		nombres.remove(3);
		
		//SYSO
		System.out.println("Nombre obtenido" + nombres.get(0));
		
		//Obtener todo con for
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("Datos for: " + nombres.get(i));
		}
		//Obtener todo con for each
		for (String x : nombres) {
			System.out.println("Datos for each: " + x);
		}
		
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		// TODO: handle exception
	}
}
}
