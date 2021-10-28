
package Registro;

import java.util.Scanner;

public class TestRegistro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro r = new Registro();
        
        System.out.println("Numero Paquete: ");
        int NPaquetes = sc.nextInt();
        System.out.println("Fecha:\nDia: ");
        int Dia = sc.nextInt();
        System.out.println("Mes: ");
        int Mes = sc.nextInt();
        System.out.println("Año: ");
        int Año = sc.nextInt();
        System.out.println("Nombre: ");
        String Nombre = sc.nextLine();
        System.out.println("Direccion: Calle: ");
        String Calle = sc.nextLine();
        System.out.println("Carrera: ");
        String carrera = sc.nextLine();
        System.out.println("Pais: ");
        String Pais = sc.nextLine();
        System.out.println("Ciudad: ");
        String Ciudad = sc.nextLine();
        System.out.println("Telefono: ");
        int Telefono = sc.nextInt();
        System.out.println("Codigo Postal: "); 
        String CodigoPostal = sc.nextLine();
        
        r.setNPaquetes(NPaquetes);
        r.setDia(Dia);
        r.setMes(Mes);
        r.setAño(Año);
        r.setNombre(Nombre);
        r.setCalle(Calle);
        r.setCarrera(carrera);
        r.setPais(Pais);
        r.setCiudad(Ciudad);
        r.setTelefono(Telefono);
        r.setCodigoPostal(CodigoPostal);

        System.out.println("Datos");
        System.out.println("Numero Paquete: " + r.getNPaquetes());
        System.out.println("Fecha: " + r.getDia() + "/" + r.getMes() + "/" + r.getAño());
        System.out.println("Direccion:" + r.getCarrera() + "" + r.getCalle());
        System.out.println("Nombre: " + r.getNombre());
        System.out.println("Pais: " + r.getPais());
        System.out.println("Ciudad: " + r.getCiudad());
        System.out.println("Telefono: " + r.getTelefono());
        System.out.println("Codigo Postal: " + r.getCodigoPostal());
     

    } 
}
