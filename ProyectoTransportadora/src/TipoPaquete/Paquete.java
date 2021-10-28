
package TipoPaquete;

public class Paquete {
    double Peso;
    private double Largo;
    private double Ancho;
    private double Alto;

    public Paquete() {
    }

    
    public Paquete(double Peso, double Largo, double Ancho, double Alto) {
        this.Peso = Peso;
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Alto = Alto;
    }

    public double getPeso() {
        return Peso;
    }

    public double getLargo() {
        return Largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public double getAlto() {
        return Alto;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }
    
    
    
    
    
    
    
}
