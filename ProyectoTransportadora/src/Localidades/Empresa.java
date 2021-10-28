package Localidades;

public class Empresa {

    private String nombre;
    private Envio listaEnvios[] = new Envio[10];
    private int numEnvio = 0;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, Envio en[]) {
        this.nombre = nombre;
        listaEnvios = en;
        numEnvio = en.length;
    }

    public void insertarEnvio(Envio envio) {
        listaEnvios[numEnvio] = envio;
        numEnvio++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEnvio() {
        return numEnvio;
    }

    public Envio getVuelo(int i) {
        return listaEnvios[i];

    }

    public Envio getEnvio(String id) {
        boolean encontrado = false;
        int i = 0;
        Envio en = null;
        while ((!encontrado) && (i < listaEnvios.length)) {
            if (id.equals(listaEnvios[i].getIdentificador())) {
                en = listaEnvios[i];

            }
            i++;
        }
        return en;
    }

}
