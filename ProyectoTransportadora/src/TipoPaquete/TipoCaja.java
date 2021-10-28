package TipoPaquete;

public class TipoCaja extends Paquete {

    private double volumen;

    public TipoCaja() {
    }

    public TipoCaja(double Peso, double Largo, double Ancho, double Alto) {
        super(Peso, Largo, Ancho, Alto);
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public double getPeso() {
        return Peso;
    }

    public void asignacionrepartidores() {
        if ((Peso == 1) || (volumen > 0 && volumen < 1000)) {
            System.out.println("Asignado a repartidores Categoria A");
        } else if ((Peso > 1 && Peso < 20) || (volumen > 1000 && volumen < 100000000)) {
            System.out.println("Asignado a repartidores tipo B");
        } else {
            System.out.println("Asignado a repartidores tipo C");
        }

    }

}
