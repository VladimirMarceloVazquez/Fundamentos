package org.ejemplo.herenciaradio;

public class MiniComponente extends Radio {

    @Override
    public void volumen() {
        agrega("MiniComponente.volumen()");
        super.volumen();
    }

    public void equalizador() {
        agrega("equalizador()");
    }

    public static void main(String[] args) {
        MiniComponente x = new MiniComponente();
        x.frecuencia();
        x.volumen();
        x.modelo();
        x.equalizador();
        x.imprimir();

        System.out.println("Probar la clase base: ");
        Radio.main(args);
    }
}
