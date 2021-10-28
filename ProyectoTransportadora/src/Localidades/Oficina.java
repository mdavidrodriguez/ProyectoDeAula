package Localidades;

public class Oficina {

    private String nombre;
    private String ciudad;
    private String pais;
    private Empresa listaEmpresas[] = new Empresa[2];
    private int numEmpresa;

    public Oficina(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numEmpresa = 0;

    }

    public Oficina(String nombre, String ciudad, String pais, Empresa e[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaEmpresas = e;
        this.numEmpresa = e.length;

    }
    public void insertarEmpresa(Empresa empresa){
        listaEmpresas[numEmpresa] = empresa;
        numEmpresa++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Empresa[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    public Empresa getEmpresa(int i){
        return listaEmpresas[i];
    }
    public Empresa getEmpresa(String nombre){
        boolean encontrado = false;
        int i = 0;
        Empresa e = null;
        while((!encontrado)&&(i<listaEmpresas.length)){
            if(nombre.equals(listaEmpresas[i].getNombre())){
                encontrado = true;
                e = listaEmpresas[i];
            }
            i++;
        }
        return e;
    }

}
