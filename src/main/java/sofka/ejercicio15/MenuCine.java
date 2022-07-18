package sofka.ejercicio15;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class MenuCine {

    public static void main(String[] args) {
        final Logger log = Logger.getLogger("Logger");
        Scanner entrada = new Scanner(System.in);
        short opcion = 0;

        while (opcion != 8) {
            log.info("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            try {
                log.info("Digite una opción");
                opcion = entrada.nextShort();
                if(opcion >8 || opcion<1){
                    log.info("pción errada,digita un número entre 1 y 8");
                }


            }catch (Exception error){
                log.error("Opción errada, solo se admiten números entre 1 y 8:\n"+error);

            }

            switch (opcion) {
                case 1 -> log.info("Nuevo Actor");
                case 2 -> log.info("Buscar Actor");
                case 3 -> log.info("Eliminar Actor");
                case 4 -> log.info("Modificar Actor");
                case 5 -> log.info("Ver Todos Los Actores");
                case 6 -> log.info("Ver Peliculas De Los Actores");
                case 7 -> log.info("Ver Categoria De Las Peliculas De Los Actores");
                case 8 -> log.info("Finalizado");
            }
        }

    }

}





