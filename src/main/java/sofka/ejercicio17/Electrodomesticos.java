package sofka.ejercicio17;

public class Electrodomesticos {
    private int precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double pesoKg = 5.0;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precioBase, double pesoKg) {
        this.precioBase = precioBase;
        this.pesoKg = pesoKg;
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, double pesoKg) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoKg = pesoKg;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPesoKg() {
        return pesoKg;
    }


    public void comprobrarConsumoEnergetico(char consumoEnergetico) {
        switch (consumoEnergetico) {
            case 'A', 'B', 'C', 'D', 'E' -> this.consumoEnergetico = consumoEnergetico;
            default -> this.consumoEnergetico = 'F';
        }
    }

    public void comprobraColor(String color) {
        switch (color) {
            case "blanco", "negro", "rojo", "azul", "gris" -> this.color = color;
        }
    }

    public double preciFinal() {

        double precioElectrodomestico = 0;
        switch (consumoEnergetico) {
            case 'A' -> precioElectrodomestico += 100;
            case 'B' -> precioElectrodomestico += 80;
            case 'C' -> precioElectrodomestico += 60;
            case 'D' -> precioElectrodomestico += 50;
            case 'E' -> precioElectrodomestico += 30;
            case 'F' -> precioElectrodomestico += 10;
        }

        if (pesoA(19)) {
            precioElectrodomestico = 10;
        }

        else if (casoB(20, 49)) {
            precioElectrodomestico = 50;
        }

        else if (casoC(50, 79)) {
            precioElectrodomestico = 80;
        }

        else if (pesoKg > 80) {
            precioElectrodomestico = 100;
        }

        return precioBase + precioElectrodomestico;

    }

    private boolean casoC(int x, int x1) {
        return pesoKg >= x && pesoKg <= x1;
    }

    private boolean casoB(int x, int x1) {
        return pesoKg >= x && pesoKg <= x1;
    }

    private boolean pesoA(int x) {
        return pesoKg <= x;
    }


}







