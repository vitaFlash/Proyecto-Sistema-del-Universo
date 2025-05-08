package com.vitaliia.universo.parte2;

public class MainParte2 {
public static void Main(String[] args) {
    // Crear instancias de los cuerpos celestes
    Planeta tierra = new Planeta("Tierra", 5.972e24, 12742, true);
    Estrella sol = new Estrella("Sol", 1.989e30, 1392700, 5778);


    // Mostrar información de los cuerpos celestes
    tierra.describir();
    sol.describir();


    // Emitir luz y orbitar
    sol.emitirLuz();
    tierra.orbitar();
}}
