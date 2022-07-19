package sofka.ejercicio7;
import org.jboss.logging.Logger;
import sofka.ejercicio5.Ejercico5;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercico5.class.getName());
        Scanner lectura = new Scanner(System.in);
        int numero = 0;
        do{
            try{
                logger.info("Digita un numero entero: ");
                numero = lectura.nextInt();
                if (numero >= 0){
                    logger.info(numero);
                }
            }catch(Exception exception){
                logger.error(exception);
            }
        }while(numero < 0);
    }
}
