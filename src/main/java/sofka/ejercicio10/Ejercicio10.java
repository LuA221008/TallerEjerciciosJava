package sofka.ejercicio10;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());
        Scanner lectura = new Scanner(System.in);

        logger.info("Digita tu frase: ");
        String frase = lectura.nextLine();
        String fraseSinEspacios = frase.replaceAll("\\s+", "");
        logger.info(fraseSinEspacios);
    }
}
