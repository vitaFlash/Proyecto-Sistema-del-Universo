package org.example;

public class Estrella extends CuerpoCeleste {
    private double temperaturaSuperficial; // en Kelvin

    public Estrella(String nombre, double masa, double diametro, double temperaturaSuperficial) {
        super(nombre, masa, diametro);
        this.temperaturaSuperficial = temperaturaSuperficial;
    }
    public double getTemperaturaSuperficial() {
        return temperaturaSuperficial;
    }
    public void setTemperaturaSuperficial(double temperaturaSuperficial) {
        this.temperaturaSuperficial = temperaturaSuperficial;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Temperatura superficial: " + temperaturaSuperficial + " K");
    }
}
