package Localidades;

public class Oficinados extends Oficina {

    private double subvencion;

    public Oficinados(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Oficinados(double subvencion, String nombre, String ciudad, String pais, Empresa[] e) {
        super(nombre, ciudad, pais, e);
        this.subvencion = subvencion;
    }

    public Oficinados(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }

}
