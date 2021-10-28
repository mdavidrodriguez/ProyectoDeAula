
package TipoPaquete;

public class TipoSobre extends Paquete{
    private int CodigoPostalPaquete;

    public TipoSobre() {
    }

    public TipoSobre(double Peso, double Largo, double Ancho, double Alto, int CodigoPostalPaquete) {
        super(Peso, Largo, Ancho, Alto);
        this.CodigoPostalPaquete=CodigoPostalPaquete;
    }

    public int getCodigoPostalPaquete() {
        return CodigoPostalPaquete;
    }

    @Override
    public double getPeso() {
        return Peso;
    }

    public void setCodigoPostalPaquete(int CodigoPostalPaquete) {
        this.CodigoPostalPaquete = CodigoPostalPaquete;
    }

    @Override
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    

   
    
    
    
    
    

    

   
    
    
    
    
}
