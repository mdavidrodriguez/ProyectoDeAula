package datos;

import Excepciones.ExcepcionAccesoDatos;
import entidades.Oficina;
import java.util.*;

public class ImpArrayList implements IEnvio {

    private List lista;

    public ImpArrayList() {
        this.lista = lista;
    }


    @Override
    public boolean agregarEnvio(Oficina ofi)throws ExcepcionAccesoDatos {
        return this.lista.add(ofi);

    }

    @Override
    public Oficina eliminarEnvio(Oficina ofi) throws ExcepcionAccesoDatos {
        Oficina eliminado = null;
        Iterator<Oficina> i = this.lista.iterator();
        while (i.hasNext()) {
            Oficina proximo = i.next();
            if (proximo.getUsuario().equals(ofi.getUsuario())) {
                eliminado = proximo;
                i.remove();
                return eliminado;

            }
            
        }
          throw new ExcepcionAccesoDatos("El repartidor con usaurio" + ofi.getUsuario()+ "No se encuentra en la lista de repartidores" );
        
    }

    @Override
    public int getTotalEnviosRealizados() throws ExcepcionAccesoDatos{
        return this.lista.size();
    }
}
