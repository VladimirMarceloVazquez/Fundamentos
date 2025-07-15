package org.ejemplo.hilos;

// Clase principal pública (debe tener el mismo nombre que el archivo .java)
public class Hilos_Synchronized {

    // Clase interna: Empleado
    static class Empleado {
        private String nombre = "Carlos";

        // Método crítico: solo un hilo a la vez
        //Se debe usar synchronized para programar las entradas en orden
        //Osea que solo permita el "paso" a 1 metodo o hilo, y luego al terminar
        //da paso al siguiente
        //si no se hace esto, hay errores, inconsistencias al momento de ejecutar
        
        public synchronized void consultarNombre(String tarea) {
            System.out.println(tarea + " entrando...");

            try {
                Thread.sleep(1000); // Simula espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(tarea + " obtuvo el nombre: " + nombre);
            System.out.println(tarea + " saliendo...\n");
        }
    }

    // Clase interna: HiloConsulta
    static class HiloConsulta extends Thread {
        private Empleado empleado;
        private String tarea;

        public HiloConsulta(Empleado emp, String tarea) {
            this.empleado = emp;
            this.tarea = tarea;
        }

        public void run() {
            empleado.consultarNombre(tarea);
        }
    }

    // Método main para ejecutar la prueba
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        HiloConsulta hilo1 = new HiloConsulta(empleado, "Verificar asistencia");
        HiloConsulta hilo2 = new HiloConsulta(empleado, "Calcular salario");

        hilo1.start();
        hilo2.start();
    }
}
