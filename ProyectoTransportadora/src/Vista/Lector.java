package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {
    private static Scanner lector = new Scanner(System.in);
    
    public static int leerEntero(String title){
        int var=0;
        boolean error;
        do{
            try{
                System.out.print(title);
                var = lector.nextInt();
                error = false;
                return var;
            }
            catch(InputMismatchException ime){
                System.out.println("Error de lectura: se requiere un valor entero" );
                lector.nextLine();
                error = true;
            }
        }while(error);    
        return var;
    }
    public static String leerString(String title){
        System.out.print(title);
        return lector.next();
    }

}
