package org.ejemplo.herenciaradio;

class Radio {

    private String r = new String();

    public void agrega(String a) {
        r += a + " ";
    }

    public void imprimir() {
        System.out.println(r.trim());
    }

    public void frecuencia() {
        agrega("frecuencia()");
    }

    public void volumen() {
        agrega("volumen()");
    }

    public void modelo() {
        agrega("modelo()");
    }

    public static void main(String[] args) {
        Radio x = new Radio();
        x.frecuencia();
        x.volumen();
        x.modelo();
        x.imprimir();
    }
}

