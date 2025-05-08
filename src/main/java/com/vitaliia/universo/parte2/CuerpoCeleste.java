package com.vitaliia.universo.parte2;

public abstract class CuerpoCeleste {
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

    public double getMasa() {
        return masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public abstract void describir(); // abstract method

}
