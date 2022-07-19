package sofka.ejercicio12;

import org.jboss.logging.Logger;
import sofka.ejercicio6.Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio6.class.getName());
        Scanner lectura = new Scanner(System.in);

        logger.info("Digita la primera palabra");
        String palabra1 = lectura.nextLine();

        logger.info("Digita la primera palabra");
        String palabra2 = lectura.nextLine();

        String[] caracteresPalabra1 = palabra1.split("");
        String[] caracteresPalabra2 = palabra2.split("");

        List<String> listaPalabra1 = Arrays.asList(caracteresPalabra1);
        List<String> listaPalabra2 = Arrays.asList(caracteresPalabra2);

        List<String> unionPalabras = new ArrayList<>(listaPalabra1);
        List<String> interseccionPalabras = new ArrayList<>(listaPalabra1);

        unionPalabras.addAll(listaPalabra2);
        interseccionPalabras.retainAll(listaPalabra2);
        unionPalabras.removeAll(interseccionPalabras);

        if (palabra1.equalsIgnoreCase(palabra2)) logger.info("las palabras son iguales");
        else logger.info("las diferencias entre las palabras son: " + unionPalabras);


    }
}
