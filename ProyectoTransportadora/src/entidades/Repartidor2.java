package entidades;

public class Repartidor2 extends Oficina {
    private int numDocumento;
    private String nombre;
    private String apellido;
    private int ZonaEntrega;
    private String Categoria;
    private String LocalidadEntrega;
    private String ciudadDeEnvio;
    private double PrecioEnvio;
    private String CiudadEnrega;

    public Repartidor2() {
    }

    public Repartidor2(int numDocumento, String nombre, String apellido, int ZonaEntrega, String Categoria, String LocalidadEntrega, String ciudadDeEnvio, double PrecioEnvio, String CiudadDeEnvio, String CiudadEnrega, String usuario, String Contraseña) {
        super(usuario, Contraseña);
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ZonaEntrega = ZonaEntrega;
        this.Categoria = Categoria;
        this.LocalidadEntrega = LocalidadEntrega;
        this.ciudadDeEnvio = ciudadDeEnvio;
        this.PrecioEnvio = PrecioEnvio;
        this.CiudadEnrega = CiudadEnrega;
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

    public double getPrecioEnvio() {
        return PrecioEnvio;
    }

    public String getCiudadEnrega() {
        return CiudadEnrega;
    }

    @Override
    public String getEnvio() {
        return "Ciudad de Envio: " + this.ciudadDeEnvio + "\nCiudad de entrega: " + this.CiudadEnrega;
        }

    @Override
    public String getDatosrepartidor() {
        return  "\nNumero de documento: " + this.numDocumento + "\nNombre: " + this.nombre +
               "\nApellido: " + this.apellido + "\nZona Entrega: " + this.ZonaEntrega + "\nCategoria : " +
               this.Categoria;
        }

}
