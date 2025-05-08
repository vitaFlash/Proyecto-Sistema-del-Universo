package com.vitaliia.universo.parte2;
public class Estrella extends CuerpoCeleste implements Luminiscente {
    private double temperaturaSuperficie; // en Kelvin
    public Estrella (String nombre, double masa, double diametro, double temperaturaSuperficie) {
        super(nombre, masa, diametro);
        this.temperaturaSuperficie = temperaturaSuperficie;
    }
    public double getTemperaturaSuperficie() {
        return temperaturaSuperficie;
    }
    public void setTemperaturaSuperficie(double temperaturaSuperficie) {
        this.temperaturaSuperficie = temperaturaSuperficie;
    }
    @Override
    public void describir() {
        System.out.println("Estrella: " + getNombre());
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro: " + getDiametro() + " km");
        System.out.println("Temperatura de superficie: " + temperaturaSuperficie + " K");
    }
    @Override
    public void emitirLuz() {
        System.out.println(getNombre() + " está emitiendo luz.");
    }
}
