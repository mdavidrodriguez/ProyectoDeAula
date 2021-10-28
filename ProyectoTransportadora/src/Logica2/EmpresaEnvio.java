package Logica2;

import Excepciones.ExcepcionAccesoDatos;
import entidades.*;
import datos.*;

public class EmpresaEnvio {
    private IEnvio listaEnviosRealizados;

    public EmpresaEnvio(){
        this.listaEnviosRealizados = new ImpArrayList();
    }

    public IEnvio getListaEnviosRealizados() {
        return listaEnviosRealizados;
    }

    public void setListaEnviosRealizados(IEnvio listaEnviosRealizados) {
        this.listaEnviosRealizados = listaEnviosRealizados;
    }
    
    public boolean agregarEnvio(Oficina ofi) throws ExcepcionAccesoDatos{
        this.listaEnviosRealizados.agregarEnvio(ofi);
        return true;
        
    }
    public Oficina eliminarEnvio(Oficina ofi) throws ExcepcionAccesoDatos{
        return this.listaEnviosRealizados.eliminarEnvio(ofi);
    }
    

}
