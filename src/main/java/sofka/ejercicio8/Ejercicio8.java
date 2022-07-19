package sofka.ejercicio8;

import org.jboss.logging.Logger;
import sofka.ejercicio5.Ejercico5;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ejercico5.class.getName());
        Scanner lectura = new Scanner(System.in);

        logger.info("Digita un día de la semana, ejemplo: lunes");
        String dia = lectura.nextLine().toLowerCase();

        final String DIALABORAL = " es día laboral";
        final String NODIALABORAL = " no es día laboral";

        switch (dia){
            case "lunes"        -> logger.info(dia+DIALABORAL);
            case "martes"       -> logger.info(dia+DIALABORAL);
            case "miercoles"    -> logger.info(dia+DIALABORAL);
            case "jueves"       -> logger.info(dia+DIALABORAL);
            case "viernes"      -> logger.info(dia+DIALABORAL);
            case "sabado"       -> logger.info(dia+NODIALABORAL);
            case "domingo"      -> logger.info(dia+NODIALABORAL);
            default             -> logger.info("No es un día de la semana, intenta nuevamente");
        }

    }
}
