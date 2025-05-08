package com.vitaliia.universo.parte2;

import com.vitaliia.universo.parte2.CuerpoCeleste;

public class Planeta extends CuerpoCeleste implements Orbitable {
    private boolean tieneVida;
    public Planeta(String nombre, double masa, double diametro, boolean tieneVida) {
        super(nombre, masa, diametro);
        this.tieneVida = tieneVida;
    }
    public boolean tieneVida() {
        return tieneVida;
    }
    @Override
    public void describir() {
        System.out.println("Planeta: " + getNombre());
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro: " + getDiametro() + " km");
        System.out.println("¿Tiene vida?: " + (tieneVida ? "Sí" : "No"));
    }
    @Override
    public void orbitar() {
        System.out.println(getNombre() + " está orbitando una estrella.");
    }

}
