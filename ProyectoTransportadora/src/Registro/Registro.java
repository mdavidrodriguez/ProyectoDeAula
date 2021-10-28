package Registro;

public class Registro {

    private int NPaquetes;
    private int Dia, Mes, Año;
    private String Nombre;
    private String Calle, carrera;
    private String Pais;
    private String Ciudad;
    private int Telefono;
    private String CodigoPostal;

    public Registro() {
    }

    public Registro(int NPaquetes, int Dia, int Mes, int Año, String Nombre, String Calle, String carrera, String Pais, String Ciudad, int Telefono, String CodigoPostal) {
        this.NPaquetes = NPaquetes;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.carrera = carrera;
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.Telefono = Telefono;
        this.CodigoPostal = CodigoPostal;
    }

    public int getNPaquetes() {
        return NPaquetes;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAño() {
        return Año;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getPais() {
        return Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setNPaquetes(int NPaquetes) {
        this.NPaquetes = NPaquetes;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    

}
