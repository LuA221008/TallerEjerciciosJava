package sofka.ejercicio4;

import org.jboss.logging.Logger;
import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        double iva = 0.21;
        double valorProducto;
        double valorFinal;

        final Logger log = Logger.getLogger("Logger");
        Scanner entrada = new Scanner(System.in);

        log.info("Ingrese el precio del producto a calcular:");
        valorProducto = entrada.nextDouble();
        valorFinal = (valorProducto)*(iva) + valorProducto;
        log.info("El valor final del producto es:\n"+"$"+valorFinal);
    }

}
