package sofka.ejercicio14;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());
        Scanner lectura = new Scanner(System.in);

        logger.info("Digite un número");
        int numero = lectura.nextInt();

        for (int secuencia = numero; secuencia <= 1000; secuencia+=2) {
            logger.info(secuencia);

        }
    }
}
