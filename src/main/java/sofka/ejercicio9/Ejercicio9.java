package sofka.ejercicio9;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        final String FRASE = "La sonrisa será la mejor arma contra la tristeza";
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());
        Scanner lectura = new Scanner(System.in);

        String reemplazoFrase = FRASE.replace("a", "e");
        String reemplazoTilde = reemplazoFrase.replace("á", "e");
        logger.info("Digita tu frase: ");
        String fraseUsuario = lectura.nextLine();
        String fraseFinal = reemplazoTilde.concat(fraseUsuario);
        logger.info(fraseFinal);
    }
}
