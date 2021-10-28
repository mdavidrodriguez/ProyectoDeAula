package Logica2;

import entidades.*;
import Excepciones.EntidadException;

public class OficinaEnvios {

    
    
    public static Oficina getOficina(String tipo,int numDocumento, String nombre, String apellido, int ZonaEntrega, String Categoria, String LocalidadEntrega, String ciudadDeEnvio, String usuario, String Contraseña,double PrecioEnvio)
            throws EntidadException {
        Oficina ofi = null;
        try {
            switch (tipo) {
                case "Repartidor":
                    ofi = new Repartidor(numDocumento, nombre, apellido, ZonaEntrega, Categoria,LocalidadEntrega, ciudadDeEnvio,usuario,Contraseña,PrecioEnvio);
                    break;
                case "Repartidor2":
                    ofi = new Repartidor2(numDocumento, nombre, apellido, ZonaEntrega, Categoria,LocalidadEntrega, ciudadDeEnvio, PrecioEnvio, ciudadDeEnvio, ciudadDeEnvio, usuario, Contraseña);
            }
            return ofi;
        } catch (IllegalArgumentException ie) {
            throw new EntidadException(ie.getMessage());
        }
    }

}
