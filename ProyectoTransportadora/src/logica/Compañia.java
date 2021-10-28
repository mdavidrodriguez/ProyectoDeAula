package logica;

import Registro.Registro;

public class Compañia {

    private String nombre;
    private Destino listaDestinos[] = new Destino[10];
    private int numDestinos = 0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Destino d[]) {
        this.nombre = nombre;
        listaDestinos = d;
        numDestinos = d.length;

    }

    public void insertarDestino(Destino destino) {
        listaDestinos[numDestinos] = destino;
        numDestinos++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumDestinos() {
        return numDestinos;
    }

    public Destino getDestino(int i) {
        return listaDestinos[i];
    }

    public Destino getDestino(String id) {
        boolean encontrado = false;
        int i = 0;
        Destino d = null;
        while ((!encontrado) && (i < listaDestinos.length)) {
            if (id.equals(listaDestinos[i].getIdentificador())) {
                encontrado = true;
                d = listaDestinos[i];

            }
            i++;
        }
        return d;
    }

    void insertarRegistro(Registro registro) {
    }

}
