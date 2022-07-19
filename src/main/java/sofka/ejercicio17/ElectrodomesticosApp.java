package sofka.ejercicio17;

import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class ElectrodomesticosApp {

    public static void main(String[] args) {
        float precioTotalLavadora = 0;
        float precioTotalTelevision = 0;
        float precioTotalElectrodomestico = 0;
        float precioPorElectrodomestico = 0;
        Logger logger = Logger.getLogger(ElectrodomesticosApp.class.getName());

        List<Electrodomesticos> listaElectrodomesticos = new ArrayList<>();
        listaElectrodomesticos.add(new Lavadora(200, "rojo", 'C', 50, 20));
        listaElectrodomesticos.add(new Television(500, "negro", 'B', 10, 45, false));
        listaElectrodomesticos.add(new Lavadora(200, "rojo", 'A', 50, 20));
        listaElectrodomesticos.add(new Lavadora(150, "azul", 'G', 80, 60));
        listaElectrodomesticos.add(new Television(450, "amarillo", 'E', 10, 10, true));
        listaElectrodomesticos.add(new Lavadora(200, "rojo", 'B', 50, 20));
        listaElectrodomesticos.add(new Television(500, "amarillo", 'D', 10, 40, true));
        listaElectrodomesticos.add(new Lavadora(300, "blanco", 'C', 92, 15));
        listaElectrodomesticos.add(new Lavadora(200, "negro", 'B', 150, 60));
        listaElectrodomesticos.add(new Electrodomesticos(100, "rojo", 'A', 190));

        for (Electrodomesticos electrodomestico : listaElectrodomesticos) {

            logger.info("El precio final de cada producto es: " + electrodomestico.preciFinal());
        }

        for (Electrodomesticos electrodomestico : listaElectrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadora += electrodomestico.preciFinal();
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevision += electrodomestico.preciFinal();
            } else {
                precioTotalElectrodomestico += electrodomestico.preciFinal();

            }

        }
        logger.info("El precio final de cada lavadora es: " + precioTotalLavadora);
        logger.info("El precio final de cada television: " + precioTotalTelevision);
        logger.info("El precio final de todos los electrodomesticos es: " +(precioTotalElectrodomestico+precioTotalTelevision+precioTotalTelevision));
    }
}
