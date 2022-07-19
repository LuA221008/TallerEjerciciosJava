package sofka.ejercicio17;

public class Lavadora extends Electrodomesticos {

    private double carga = 5.0;

    public Lavadora(int precioBase, double pesoKg) {
        super(precioBase, pesoKg);
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, double pesoKg, double carga) {
        super(precioBase, color, consumoEnergetico, pesoKg);
        this.carga = carga;
    }


    public double getCarga() {
        return carga;
    }

    @Override
    public double preciFinal() {
        double precioElectrodomestico = super.preciFinal();
        if (carga > 30) {
            precioElectrodomestico += 30;
        }
        return precioElectrodomestico;

    }
}