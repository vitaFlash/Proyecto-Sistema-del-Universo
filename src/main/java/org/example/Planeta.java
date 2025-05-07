package org.example;

public class Planeta extends CuerpoCeleste {
    public boolean tieneVida;
    public Planeta(String nombre, double masa, double diametro, boolean tieneVida) {
        super(nombre, masa, diametro);
        this.tieneVida = tieneVida;
    }
    public boolean isTieneVida() {
        return tieneVida;
    }
    public void setTieneVida(boolean tieneVida) {
        this.tieneVida = tieneVida;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene vida? " + (tieneVida ? "Sí" : "No"));
    }
}
