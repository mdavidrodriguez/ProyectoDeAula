package Login;

public class Logging {

    public String logging(String usuario, String password) {

        String mensaje;
        if (usuario.equals("Admin") && password.equals("1111")) {
            mensaje = "Usuario Admin logeado";
        } else if ((usuario.equals("Administrador") && password.equals("1234"))) {
            mensaje = "Usuario Administrador logueado";
        } else if ((usuario.equals("Repartidor") && password.equals("7777"))) {
            mensaje = "Usuario Repartidor logueado";
        } else if ((usuario.equals("Cliente"))) {
            mensaje = "Usuario Cliente logueado ";
        } else {
            mensaje = "Usuario o Constraseña Incorrectas";
        }

        return mensaje;

    }

}
