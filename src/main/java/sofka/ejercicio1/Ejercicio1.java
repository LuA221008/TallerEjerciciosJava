package sofka.ejercicio1;

import org.jboss.logging.Logger;

public class Ejercicio1 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;
        final Logger log = Logger.getLogger("Logger");

        if (num1 > num2) {
            log.info("El número mayor es:\n" + num1);
        } else if (num1 == num2) {
            log.info("Los números " + "" + num1 + " " + "y " + num2 + "  " + "son iguales");

        } else {
            log.info("El número mayor es: \n" + num2);
        }
    }


}
