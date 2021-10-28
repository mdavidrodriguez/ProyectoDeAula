package Excepciones;

import java.io.IOException;

public class ExcepcionAccesoDatos extends IOException {

    public ExcepcionAccesoDatos(String message) {
        super(message);
    }
}
