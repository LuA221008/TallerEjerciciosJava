package sofka.ejercicio13;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public static void main(String[] args) {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());

        logger.info("La fecha y hora actual es: " + formatoFecha.format(LocalDateTime.now()));
    }
}
