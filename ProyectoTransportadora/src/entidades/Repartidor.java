
package entidades;

public class Repartidor extends Oficina{
    private int numDocumento;
    private String nombre;
    private String apellido;
    private int ZonaEntrega;
    private String Categoria;
    private String LocalidadEntrega;
    private String ciudadDeEnvio;
    private double PrecioEnvio;

    public Repartidor() {
    }

    public Repartidor(int numDocumento, String nombre, String apellido, int ZonaEntrega, String Categoria, String LocalidadEntrega, String ciudadDeEnvio, String usuario, String Contraseña,double PrecioEnvio) {
        super(usuario, Contraseña);

        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ZonaEntrega = ZonaEntrega;
        this.Categoria = Categoria;
        this.LocalidadEntrega = LocalidadEntrega;
        this.ciudadDeEnvio = ciudadDeEnvio;
        this.PrecioEnvio=PrecioEnvio;
        
    }

    @Override
    public String getEnvio(){
        return "Ciudad de Envio: " + this.ciudadDeEnvio + "Localidad de entrega: " + this.LocalidadEntrega;
    }
    
   @Override
    public String getDatosrepartidor() {
        return "Credenciales de Acceso: " + this.getEnvio() + "\nNumero de documento: " + this.numDocumento + "\nNombre: " + this.nombre +
               "\nApellido: " + this.apellido + "\nZona Entrega: " + this.ZonaEntrega + "\nCategoria : " +
               this.Categoria;
    }
    public int getNumDocumento() {
        return numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getZonaEntrega() {
        return ZonaEntrega;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getLocalidadEntrega() {
        return LocalidadEntrega;
    }

    public String getCiudadDeEnvio() {
        return ciudadDeEnvio;
    }
    public double getPrecioEnvio(){
        return PrecioEnvio;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setZonaEntrega(int ZonaEntrega) {
        this.ZonaEntrega = ZonaEntrega;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setLocalidadEntrega(String LocalidadEntrega) {
        this.LocalidadEntrega = LocalidadEntrega;
    }

    public void setCiudadDeEnvio(String ciudadDeEnvio) {
        this.ciudadDeEnvio = ciudadDeEnvio;
    }
    public void setPrecioEnvio(double PrecioEnvio){
        this.PrecioEnvio = PrecioEnvio;
    }

    

    
    
    
    
}
