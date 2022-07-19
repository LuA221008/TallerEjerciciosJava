package sofka.ejercicio5;

import org.jboss.logging.Logger;

public class Ejercico5 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ejercico5.class.getName());

        int numero = 1;
        while (numero <= 100) {
            if (numero % 2 != 0) logger.info(numero);
            else logger.info(numero);
            numero += 1;
        }
    }
}
