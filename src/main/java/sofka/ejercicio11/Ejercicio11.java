package sofka.ejercicio11;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());
        Scanner lectura = new Scanner(System.in);

        String frase = lectura.nextLine();
        int longitudFrase = frase.length();
        int cantidadVocales = frase.replaceAll("[^AEIOUaeiouáéíóúÁÉÍÓÚ]", "").length();
        int cantidadVocalesA = frase.replaceAll("[^AaáÁ]", "").length();
        int cantidadVocalesE = frase.replaceAll("[^EeéÉ]", "").length();
        int cantidadVocalesI = frase.replaceAll("[^IiíÍ]", "").length();
        int cantidadVocalesO = frase.replaceAll("[^OoóÓ]", "").length();
        int cantidadVocalesU = frase.replaceAll("[^UuúÚ]", "").length();
        logger.info("cantidadVocales TOTAL: " + cantidadVocales );
        logger.info("Longitud de la frase: " + longitudFrase );
        logger.info("cantidadVocales A: " + cantidadVocalesA );
        logger.info("cantidadVocales E: " + cantidadVocalesE );
        logger.info("cantidadVocales I: " + cantidadVocalesI );
        logger.info("cantidadVocales O: " + cantidadVocalesO );
        logger.info("cantidadVocales U: " + cantidadVocalesU );
    }
}
