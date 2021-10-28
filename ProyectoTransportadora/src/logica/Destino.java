package logica;

import Registro.*;

public class Destino {

    private String identificador;
    private String ciudadOrigen;
    private String CiudadDestino;
    private int numeroMaximoPersonas;
    private int numeroActualRegistro;
    private Registro listaRegistros[];

    public Destino(String identificador, String ciudadOrigen, String CiudadDestino, int numeroMaximoPersonas, int numeroActualRegistro, Registro[] listaRegistros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.numeroMaximoPersonas = numeroMaximoPersonas;
        this.numeroActualRegistro = 0;
        this.listaRegistros = new Registro[numeroMaximoPersonas];

    }

    public void InsertarRegistro(Registro Registro) {
        listaRegistros[numeroActualRegistro] = Registro;
        numeroActualRegistro++;

    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public int getNumeroMaximoPersonas() {
        return numeroMaximoPersonas;
    }

    public int getNumeroActualRegistro() {
        return numeroActualRegistro;
    }

    public Registro getRegistro(int i) {
        return listaRegistros[i];
    }
    public Registro getRegistro(String CodigoPostal ){
        boolean encontrado = false;
        int i = 0;
        Registro Reg = null;
        while ((encontrado==false) && (i<listaRegistros.length)){
        if (CodigoPostal.equals(listaRegistros[i].getCodigoPostal())){
            encontrado = true;
            Reg = listaRegistros[i]; 
        }
        i++;
    }
    return Reg;
        
        
    }

}
