package sofka;

import java.util.Scanner;

import org.jboss.logging.Logger;

public class Ejercicio3 {
    public static void main(String[] args) {
        final Logger log = Logger.getLogger("Logger");
        Scanner entrada = new Scanner(System.in);
        double radioCirculo;
        double areaCirculo;

        log.info("Ingrese el radio del circulo que desa calcular:");
        radioCirculo = entrada.nextDouble();
        areaCirculo = (Math.pow(radioCirculo,2)  * Math.PI);
        log.info("El área del circulo es:\n" + areaCirculo);

    }
}
