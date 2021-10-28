package AsignacionPaquetes;

import java.util.Scanner;

public class TestAsignacionDePaquetes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Asignacion a = new Asignacion();
        System.out.println("Datos de repartidores para realizar las entregas");
        System.out.println("-----------------------------------------------------");
        System.out.println("Credenciales de Acceso: \n1)Tipo Repartidor");
        System.out.println("Digite Usuario: ");
        String Usuario = entrada.nextLine();
        System.out.println("Contraseña: ");
        String Contraseña = entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Numero de documento de identidad: ");
        double numDocumento = entrada.nextDouble();
        System.out.println("Zona de entrega Asignada: ");
        String zonasentrega = entrada.nextLine();
        System.out.println("A que categoria Pertenece: \n1.Categoria A \n2.Categoria B \n3.Categoria C");
        String Categoria = entrada.nextLine();

        a.setUsuario(Usuario);
        a.setContraseña(Contraseña);
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setNumDocumento(0);
        a.setZonasEntregas(zonasentrega);
        a.setCategoria(Categoria);

        System.out.println("Credenciales de Acceso: \nTipo Repartidor");
        System.out.println("----------------------------");
        System.out.println("Usuario: " + a.getUsuario() + " Contraseña: " + a.getContraseña());
        System.out.println("Datos del repartidor");
        System.out.println("------------------------------");
        System.out.println("Nombre: " + a.getNombre() + a.getApellido());
        System.out.println("Zona de entrega Asignada");
        System.out.println("----------------------------");
        System.out.println("Zona: " + a.getZonasEntregas());
        System.out.println("Categoria: " + a.getCategoria());

    }

}
