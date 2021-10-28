
package TipoPaquete;

import java.util.Scanner;

public class TestPaquetes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TipoCaja c = new TipoCaja();
        
        System.out.println("Digite el peso: ");
        double Peso = sc.nextDouble();
        System.out.println("Digite el largo: ");
        double largo = sc.nextDouble();
        System.out.println("Digite el Ancho: ");
        double Ancho = sc.nextDouble();
        System.out.println("Digite el Alto: ");
        double Alto = sc.nextDouble();
        System.out.println("Digite el volumen: ");
        double volumen = sc.nextDouble();
        
        
        c.setPeso(Peso);
        c.setLargo(largo);
        c.setAncho(Ancho);
        c.setAlto(Alto);
        
        System.out.println("Tipo de Paquete: ");
        System.out.println("Peso: " + c.getPeso());
        System.out.println("Largo: " + c.getLargo());
        System.out.println("Ancho: " + c.getAncho());
        System.out.println("Alto: " + c.getAlto());
        System.out.println("Alto: " + c.getVolumen());
    
    }
  
    }


