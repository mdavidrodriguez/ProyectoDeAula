
package logica;

import java.util.Scanner;

public class TestLogica {
    Scanner sc = new Scanner(System.in);
    final static int num  = 10; // numero de localidades
    static Localidad localidades[] = new Localidad[num];
    
    public static void main(String[] args) {
        // insertar datos de las localidades
        
    }
    public static void insertardatosLocalidades(Localidad local[]){
        local[0] = new Localidad("200001","Valledupar" , "Colombia");
        local[0].insertarlocalidades(new Compañia("Trasportadora"));
        local[0].getCompañia("Trasportadora").insertarRegistro(new Registro.Registro(0, 0, 0, 0, "", "", "", "", "", 0, ""));
        
    }
    
    
}
