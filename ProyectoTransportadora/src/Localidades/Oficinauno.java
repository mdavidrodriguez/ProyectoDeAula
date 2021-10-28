package Localidades;

public class Oficinauno extends Oficina {

    private String listaOficinas[] = new String[2];
    private int numOficina;

    public Oficinauno(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Oficinauno(String nombre, String ciudad, String pais, Empresa[] e, String o[]) {
        super(nombre, ciudad, pais, e);
        this.listaOficinas = o;
        numOficina = e.length;
    }

    public void insertarOficinas(String o[]) {
        this.listaOficinas = o;
        this.numOficina = o.length;
    }

    public void insertarOficina(String o) {
        listaOficinas[numOficina] = o;
        numOficina++;
    }

    public String[] getListaOficinas() {
        return listaOficinas;
    }

    public int getNumOficina() {
        return numOficina;
    }

}
