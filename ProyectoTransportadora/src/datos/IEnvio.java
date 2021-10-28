
package datos;

import Excepciones.*;
import entidades.*;
public interface IEnvio {
    boolean agregarEnvio(Oficina ofi)throws ExcepcionAccesoDatos;
    Oficina eliminarEnvio(Oficina ofi)throws ExcepcionAccesoDatos;
    int getTotalEnviosRealizados()throws ExcepcionAccesoDatos;

}
