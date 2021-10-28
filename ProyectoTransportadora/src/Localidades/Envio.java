package Localidades;

public class Envio {
    
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int nummaximopaquetes;
    private int numActualPaquetes;
    private Localidades listaLocalidades[];
    
    public Envio(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int nummaximopaquetes) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.nummaximopaquetes = nummaximopaquetes;
        this.numActualPaquetes = 0;
        this.listaLocalidades = new Localidades[nummaximopaquetes];
        
    }
    
    public void insertarLocalidades(Localidades localidades) {
        listaLocalidades[numActualPaquetes] = localidades;
        numActualPaquetes++;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getNummaximopaquetes() {
        return nummaximopaquetes;
    }
    
    public int getNumActualPaquetes() {
        return numActualPaquetes;
    }
    
    public Localidades getLocalidades(int i) {
        return listaLocalidades[i];
    }
    
    public Localidades getLocalidades(String sector) {
        boolean encontrado = false;
        int i = 0;
        Localidades pas = null;
        while ((!encontrado == false) && (i < listaLocalidades.length)) {
            if (sector.equals(listaLocalidades[i].getSector())) {
                encontrado = true;
                pas = listaLocalidades[i];
            }
            i++;
        }
        return pas;
        
    }
    
}
