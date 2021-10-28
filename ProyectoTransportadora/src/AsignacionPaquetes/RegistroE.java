
package AsignacionPaquetes;

public class RegistroE extends Asignacion{
    private int FechaVisita;
    private int hora;
    private String repartidor;
    private String entrega;

    public RegistroE() {
    }

    public RegistroE(int FechaVisita, int hora, String repartidor, String entrega, int numDocumento, String nombre, String apellido, String ZonasEntregas, String Categoria, String Usuario, String Contraseña) {
        super(numDocumento, nombre, apellido, ZonasEntregas, Categoria, Usuario, Contraseña);
        this.FechaVisita = FechaVisita;
        this.hora = hora;
        this.repartidor = repartidor;
        this.entrega = entrega;
    }

    

    public int getFechaVisita() {
        return FechaVisita;
    }

    public int getHora() {
        return hora;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setFechaVisita(int FechaVisita) {
        this.FechaVisita = FechaVisita;
    }
 
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
    
    @Override
    public String imprimir(){
        return super.imprimir() + "Fecha de visita: " + this.FechaVisita + "\nHora de visita" + this.hora +
                "Categoria a la que pertenece el repartidor: " + this.repartidor;
        
    }
    
    
    
    
    
   
    
    
    
}
