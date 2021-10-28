
package logica;

public class Localidad {
    private String nombre;
    private String ciudad;
    private String Pais;
    private Compañia listalocalidades[] = new Compañia[10];
    private int numlocalidad;

    public Localidad(String nombre, String ciudad, String Pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.Pais = Pais;
        this.numlocalidad = 0;
    }
    public Localidad(String nombre, String ciudad, String Pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.Pais = Pais;
        listalocalidades = c;
        this.numlocalidad = c.length;
        
    }
    public void insertarlocalidades(Compañia compañia){
        listalocalidades[numlocalidad] = compañia;
        numlocalidad++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public Compañia[] getListalocalidades() {
        return listalocalidades;
    }

    public int getNumlocalidad() {
        return numlocalidad;
    }
    
    public Compañia getCompañia(int i){
        return listalocalidades[i];
    }
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i = 0;
        
        Compañia c  = null;
        while ((!encontrado)&& (i<listalocalidades.length)){
            if(nombre.equals(listalocalidades[i].getNombre())){
                encontrado = true;
                c = listalocalidades[i];
                
            }
            i++;
        }
        return c;
        
    }
    
 
    
}
