package datos;

import Excepciones.ExcepcionAccesoDatos;
import entidades.Oficina;

public class ImpArray implements IEnvio {

    private Oficina[] lista;
    private int numMaximoEnvios;
    private int nRealizados;

    public ImpArray(Oficina[] lista, int numMaximoEnvios, int nRealizados) {
        this.numMaximoEnvios = 1;
        this.lista = new Oficina[this.numMaximoEnvios];
        this.nRealizados = 0;
    }

    public Oficina[] getLista() {
        return lista;
    }

    public int getNumMaximoEnvios() {
        return numMaximoEnvios;
    }

    public int getnRealizados() {
        return nRealizados;
    }

    public void setLista(Oficina[] lista) {
        this.lista = lista;
    }

    public void setNumMaximoEnvios(int numMaximoEnvios) {
        this.numMaximoEnvios = numMaximoEnvios;
    }

    public void setnRealizados(int nRealizados) {
        this.nRealizados = nRealizados;
    }

    @Override
    public boolean agregarEnvio(Oficina ofi)throws ExcepcionAccesoDatos {
        if(this.nRealizados>=this.numMaximoEnvios)
            throw new ExcepcionAccesoDatos("El Envio asignado al repartidor con usuario "+ofi.getUsuario()+" no puede ser enviado, Se ha superado el limite de envios");
        
        this.lista[this.nRealizados] = ofi;
        this.nRealizados++;
        return true;
    }

    @Override
    public Oficina eliminarEnvio(Oficina ofi) throws ExcepcionAccesoDatos{
        Oficina eliminado = null;
        int posEliminado = 0;
        for (int i = 0; i < this.nRealizados; i++) {
            if (this.lista[i].getUsuario().equals(ofi.getUsuario())) {
                eliminado = this.lista[i];
                posEliminado = i;
            }

        }
        if(eliminado==null) 
            throw new ExcepcionAccesoDatos("El Envio asignado al repartidor con usuario " + ofi.getUsuario()+ "No se encuentra en la lista de envios" );
        
        for (int i = posEliminado + 1; i < this.nRealizados; i++) {
            this.lista[i - 1] = this.lista[i];
        }
        this.nRealizados--;
        return eliminado;
    }

    @Override
    public int getTotalEnviosRealizados() throws ExcepcionAccesoDatos{
        return this.nRealizados;
    }

}
