
package logica;


public class Localidades extends Localidad{
    private String listalocalidades[] = new String [10];
    private int numlocalidad;

    public Localidades(String nombre, String ciudad, String Pais) {
        super(nombre, ciudad, Pais);
    }

    public Localidades(String nombre, String ciudad, String Pais, Compañia[] c, String l[]) {
        super(nombre, ciudad, Pais, c);
        this.listalocalidades = l;
        numlocalidad = l.length;
        
    }
    public void insertarlocalidades(String l[]){
        this.listalocalidades = l;
        this.numlocalidad = l.length;
    }
    public void insertarlocalidad(String l){
        listalocalidades[numlocalidad] = l;
        numlocalidad++;
        
    }


    public String[] getlistalocalidades() {
        return listalocalidades;
    }


    @Override
    public int getNumlocalidad() {
        return numlocalidad;
    }
    
    
}
