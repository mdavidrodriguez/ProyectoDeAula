package Localidades;

public class Localidades {

    private String nombre;
    private String sector;
    private String pais;
    private String codigoPostal;

    public Localidades(String nombre, String sector, String pais, String codigoPostal) {
        this.nombre = nombre;
        this.sector = sector;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String sector) {
        this.sector = sector;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
