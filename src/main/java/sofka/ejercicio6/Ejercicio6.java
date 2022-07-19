package sofka.ejercicio6;

import org.jboss.logging.Logger;

public class Ejercicio6 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());

        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 2 != 0) logger.info(numero);
            else logger.info(numero);
        }
    }
}
