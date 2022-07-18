package sofka;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicioi2 {
    public static void main(String[] args) {

        final Logger log = Logger.getLogger("Logger");
        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;

        log.info("digite el primer número:");
        numero1 = entrada.nextInt();
        log.info("digite el segundo número:");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            log.info("El número mayor es:\n" + numero1);
        } else if (numero1 == numero2) {
            log.info("Los números " + "" + numero1 +" "+ "y " + numero2 + "  " + "son iguales");

        }else {
            log.info("El número mayor es: \n" + numero2);
        }




    }
}
