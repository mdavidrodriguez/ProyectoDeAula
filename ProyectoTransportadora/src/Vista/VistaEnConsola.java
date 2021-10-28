
package Vista;

import Excepciones.EntidadException;
import Excepciones.ExcepcionAccesoDatos;
import entidades.*;
import Logica2.*;
import excepciones.*;

public class VistaEnConsola {
    private String menuOpciones[] = {"1. Realizar Envio", "2. Eliminar Envio", "3. Salir"};
    private int opcionSeleccionada;
    private EmpresaEnvio empresa;
    private String usuario;
    
    public VistaEnConsola() {
        this.empresa = new EmpresaEnvio();
        
    }

    public String[] getMenuOpciones() {
        return menuOpciones;
    }

    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

    public EmpresaEnvio getEmpresa() {
        return empresa;
    }

    public void setMenuOpciones(String[] menuOpciones) {
        this.menuOpciones = menuOpciones;
    }

    public void setOpcionSeleccionada(int opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
    }

    public void setEmpresa(EmpresaEnvio empresa) {
        this.empresa = empresa;
    }
    public void runMenu(){
        do{
            this.menuOpciones();
            this.evaluarOpcion();
            
        }while(this.opcionSeleccionada!=3);
    }
     public void menuOpciones(){
            System.out.println("**** MENU OPCIONES - EMPRESA DE ENVIOS ****");
            for(String item: this.menuOpciones){
                System.out.println(item);
            }
            System.out.println("");
            this.opcionSeleccionada = Lector.leerEntero("Selecciones una opcion: ");
     }
     public void evaluarOpcion(){
        switch(this.opcionSeleccionada){
            case 1: this.realizarEnvio();break;
            case 2: this.eliminarEnvio();break;
            case 3: System.out.println("A Terminado la ejecucion de la aplicacion");break;
            default: System.out.println("La opcion seleccionada no esta disponible, intente nuevamente");
        }
     }
        public void realizarEnvio(){
        System.out.println("*** 1. REALIZAR ENVIO ****  ");
        try{
            
            Oficina ofi = this.leerOficina();
            this.empresa.eliminarEnvio(ofi);
            System.out.println("Envio agregado a la lista de envios");
            
        }catch(EntidadException ee){
            System.out.println(ee.getMessage());
        } 
        catch(ExcepcionAccesoDatos ead){
            System.out.println(ead.getMessage());
        }
    }
    
    public void eliminarEnvio(){
         System.out.println("*** 2.ELIMINACION DE ENVIOS ****  ");
         String usuario = Lector.leerString("Envio a eliminar ");
         Oficina ofi = new Repartidor();
         ofi.setContraseña(usuario);
         try{
            
             Oficina devuelto = this.empresa.eliminarEnvio(ofi);
             System.out.println(devuelto.getDatosrepartidor());
            
         }catch(ExcepcionAccesoDatos ead){
             System.out.println(ead.getMessage());
         }   
    }
    
    public Oficina leerOficina() throws EntidadException{
        System.out.println("Datos del envio: ");
        String envios = Lector.leerString("Codigo Postal: ");
        int tipo = Lector.leerEntero("Tipo Repartidor [1->Repartidor][*->Repartidor2]: ");
        Oficina ofi = null;
        switch(tipo){
            case 1:
                ofi = OficinaEnvios.getOficina("", tipo, "", "", tipo, usuario, "", usuario, usuario, "", tipo);
                     break;
            default: int EnviosR = Lector.leerEntero("Envios ");
                   int PrecioEnvio = Lector.leerEntero(" ");
                     ofi = OficinaEnvios.getOficina("", 0, "", "", 0, "", "", "", "", "", 0);
                     
                     //Codigo en desarrollo
        }
        return ofi;
        
    }
    }
    

