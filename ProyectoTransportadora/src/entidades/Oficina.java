package entidades;

public abstract class Oficina {

    private String usuario;
    private String Contraseña;

    public abstract String getEnvio();

    public abstract String getDatosrepartidor();

    public String getDatosrepartidores() {
        return "Credenciales de Acceso: \n Usuario: " + this.usuario + "\nContraseña: "
                + this.Contraseña + getDatosrepartidor();
    }

    public Oficina() {
    }
    public Oficina(String usuario) {
        
        if(usuario==null || usuario.length()==0 || usuario.equals(""))
            throw new IllegalArgumentException("Se requiere un usuario correcto");
       
        this.usuario = usuario;
    }
    

    public Oficina(String usuario, String Contraseña) {
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}
