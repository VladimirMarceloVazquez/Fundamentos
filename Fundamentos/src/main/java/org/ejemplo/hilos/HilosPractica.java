package org.ejemplo.hilos;

public class HilosPractica {
	
public static void main(String[] args) {
	ImprimirSubproceso subproceso1 = new ImprimirSubproceso("subproceso01");

	ImprimirSubproceso subproceso2 = new ImprimirSubproceso("subproceso02");

	ImprimirSubproceso subproceso3 = new ImprimirSubproceso("subproceso03");
	
	System.err.println("Iniciando subprocesos");
	
	subproceso1.start();
	subproceso2.start();
	subproceso3.start();
	
	System.err.println("Subprocesos iniciados, termina main\n" );
	//fin de main
}
	//fin de la clase probadorsubprocesos
}
class ImprimirSubproceso extends Thread {
	private int tiempoInactividad;
	
	//asignar nombre a subproceso llamando al constructor de la super clase
	public ImprimirSubproceso (String nombre) 
	{
		super(nombre);
		//elegir tiempo de inactividad aleatorio entre 0 y 5 segundos
		tiempoInactividad = (int) (Math.random() * 5001);
	}
	public void run () 
	{
		//colocar subproceso en inactividad durante el tiempo indicado por tiempoinactividad
		try {
			System.err.println(
					getName() + "va a estar inactivo durante" + tiempoInactividad);
			Thread.sleep(tiempoInactividad);
		}
		//si el subproceso se interrumpio durante su inactividad, imprimir rastreo de la
		//pila
		catch (InterruptedException exception) {
			exception.printStackTrace();
			/*
			 * para imprimir se puede usar .OUT O .ERR
			 * err se usa para señalar errores en rojo para
			 * ADVERTENCIAS, ERRORES Y MENSAJES IMPORTANTES O EXCEPCIONES
			 * */
		}
		//imprimir subproceso
		System.err.println(getName() + "Termino su inactividad");
		System.out.println("Esto es normal, no es alerta");
		//fin del metodo run
	}
}