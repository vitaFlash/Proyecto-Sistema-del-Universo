package com.vitaliia.universo.parte1;

public class CuerpoCeleste {
    private String nombre;
    private double masa; // en kg
    private double diametro; // en km

    public CuerpoCeleste(String nombre, double masa, double diametro) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Diámetro: " + diametro + " km");
    }
}
