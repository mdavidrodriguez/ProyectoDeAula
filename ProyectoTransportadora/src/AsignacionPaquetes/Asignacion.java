
package AsignacionPaquetes;

public class Asignacion { 
    private int numDocumento;
    private String nombre;
    private String apellido;
    private String ZonasEntregas;
    private String Categoria;
    private String Usuario;
    private String Contraseña;

    public Asignacion() {
    }

    public Asignacion(int numDocumento, String nombre, String apellido, String ZonasEntregas, String Categoria, String Usuario, String Contraseña) {
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ZonasEntregas = ZonasEntregas;
        this.Categoria = Categoria;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
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

    public String getZonasEntregas() {
        return ZonasEntregas;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
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

    public void setZonasEntregas(String ZonasEntregas) {
        this.ZonasEntregas = ZonasEntregas;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String imprimir(){
        return "Usuario de ingreso: " + this.Usuario + "Contraseña de ingreso: "+ this.Contraseña + "numero de documento: " + this.numDocumento + "\nNombre: " + 
                this.nombre + "\nApellido: " + this.apellido + "\nzonas de entregas: " + this.ZonasEntregas + "\nCategoria: " + this.Categoria;
    }
    
}
