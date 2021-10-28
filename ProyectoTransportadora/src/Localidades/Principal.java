
package Localidades;

import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 3;
    static Oficina oficinas[]= new Oficina[num];
    
    public static void main(String[] args) {
        insertarDatosOficinas(oficinas);
        menu();
    }
    public static void insertarDatosOficinas(Oficina ofici[]){
        ofici[0] = new Oficinados(200000000, "Sucursal1", "Bogota", "Colombia");
        ofici[0].insertarEmpresa(new Empresa("Delivery-UparOficinaPrincipal"));
        ofici[0].insertarEmpresa(new Empresa("Delivery-UparOficinaAlterna"));
        ofici[0].getEmpresa("Delivery-UparOficinaPrincipal").insertarEnvio(new Envio("ICF200", "Bogota", "Barranquilla", 20000, 10));
        ofici[0].getEmpresa("Delivery-UparOficinaPrincipal").insertarEnvio(new Envio("ICF201", "Bogota", "Valledupar", 15000, 5));
        
    }
    public static void menu(){
        int opcion;
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver Envios Realizados");
            System.out.println("2. Ver empresa");
            System.out.println("3. Listas de envios en una oficina");
            System.out.println("4. Listas de envios por compañia");
            System.out.println("5. Listar posibles envios de origen a Destino");
            System.out.println("6. Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    mostrarOficinas(oficinas);
                    break;
                case 2: //falta implementar
                    break;
                case 3://falta implementar
                    break;
                case 4: //falta implementar
                    break;
                case 5://falta implementar
                    break;
                default: System.out.println("Error, no existe esa opcion");
            }
            
        }while(opcion!=6);
    }
    public static void mostrarOficinas(Oficina oficinas[]){
        for (int i = 0; i < oficinas.length; i++) {
            if(oficinas[i] instanceof Oficinauno){
                System.out.println("Oficina uno");
                System.out.println("Nombre: " + oficinas[i].getNombre());
                System.out.println("Ciudad: " + oficinas[i].getCiudad());
                System.out.println("Pais: " + oficinas[i].getPais());
        }
            else{
                System.out.println("Oficina dos");
                System.out.println("Nombre: " + oficinas[i].getNombre());
                System.out.println("Ciudad: " + oficinas[i].getCiudad());
                System.out.println("Pais: " + oficinas[i].getPais());
        }
    }}
}
