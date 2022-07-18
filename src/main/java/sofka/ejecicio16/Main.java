package sofka.ejecicio16;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Logger log = Logger.getLogger("Logger");

        Scanner entrada = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        char sexo;
        int edad;

        log.info("Digite su nombre:");
        nombre = entrada.nextLine();

        log.info("Digite su edad:");
        edad = entrada.nextInt();

        log.info("Digite su peso en Kg:");
        peso = entrada.nextDouble();

        log.info("Digite su altura en metros, porfavor use ,:");
        altura = entrada.nextDouble();

        log.info("Digite su sexo, H si es hombre y M si es mujer");
        sexo = entrada.next().charAt(0);

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        pesoPersona(persona1);
        edadPersona(persona1);
        persona1.toString();

        String nombre1;
        char sexo1;
        int edad1;



        log.info("Digite su nombre:");
        nombre1 = entrada.nextLine();

        log.info("Digite su edad:");
        edad1 = entrada.nextInt();

        log.info("Digite su sexo, H si es hombre y M si es mujer");
        sexo1 = entrada.next().charAt(0);


        Persona persona2 = new Persona(nombre1, edad1, sexo1);
        persona2.setPeso(60);
        persona2.setAltura(1.54);
        pesoPersona(persona2);
        edadPersona(persona2);
        persona2.toString();

        Persona persona3 = new Persona();
        persona3.setNombre("Luisa");
        persona3.setEdad(20);
        persona3.setAltura(1.50);
        persona3.setPeso(20);
        persona3.setSEXO('M');

        pesoPersona(persona3);

        edadPersona(persona3);
        persona3.toString();



    }


    public static void pesoPersona(Persona p) {
        final Logger log = Logger.getLogger("Logger");
        int IMC = p.calcularIMC();
        switch (IMC) {
            case -1 -> log.info("La persona"+"  "+p.getNombre()+" "+  "posee Infrapeso");
            case 0 -> log.info("La persona"+"  "+p.getNombre()+ " "+ "tiene peso ideal");
            case 1 -> log.info("la persona"+"  "+p.getNombre()+ " "+ "tiene sobrePeso");
        }

    }

    public static void edadPersona(Persona p){
        final Logger log = Logger.getLogger("Logger");
        if(p.esMayorDeEdad()) {
            log.info("la persona"+"  "+p.getNombre()+ " "+"es mayor de edad");
        }else{
            log.info("la persona"+"  "+p.getNombre()+ " "+"es menor de edad");
        }
    }
}


