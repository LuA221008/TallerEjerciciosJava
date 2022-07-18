package sofka.ejecicio16;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char SEXO = 'H';
    private double peso = 0;
    private double altura = 0;


    public Persona() {
    }


    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = sexo;

    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.SEXO = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }


    public char getSEXO() {
        return SEXO;
    }

    public void setSEXO(char SEXO) {
        this.SEXO = SEXO;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public int calcularIMC() {
        double pesoIdeal = peso / ( Math.pow(altura, 2) );
        return imc(pesoIdeal);
    }

    private int imc(double pesoIdeal) {
        int imcPeso;
        if (casoA(pesoIdeal)) return imcPeso = -1;
        else if (casoB(pesoIdeal)) return imcPeso = 0;
        else return imcPeso = 1;
    }

    private boolean casoB(double pesoIdeal) {
        return pesoIdeal >= 20 && pesoIdeal <= 25;
    }

    private boolean casoA(double pesoIdeal) {
        return pesoIdeal < 20;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;

    }

    private void comprobarSexo() {
        if (SEXO != 'H' || SEXO != 'M') {
            this.SEXO = 'H';
        }
    }

    private void generarId() {
        Random r = new Random();
        int numeroRandom = r.nextInt(90000000) + 10000000;
        int modulo = numeroRandom % 23;
        String[] letra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };
        this.dni = String.valueOf(numeroRandom).concat(letra[ modulo ]);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", SEXO=" + SEXO +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
