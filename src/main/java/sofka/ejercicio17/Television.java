package sofka.ejercicio17;

public class Television extends  Electrodomesticos{
    private double pulgadas =20;
    private boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(int precioBase, double pesoKg) {
        super(precioBase, pesoKg);
    }

    public Television(int precioBase, String color, char consumoEnergetico, double pesoKg, double pulgadas, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, pesoKg);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double preciFinal() {
        double precioElectrodomestico= super.preciFinal();
        if(pulgadas>40){
            precioElectrodomestico+= getPrecioBase()*0.3;
        }
        if (sintonizadorTDT==true){
            precioElectrodomestico+=50;
        }

        return precioElectrodomestico;

    }
}
