package com.vitaliia.universo.parte1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainParte1 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estrella
        CuerpoCeleste tierra = new Planeta("Tierra", 5.972e24, 12742, true);
        CuerpoCeleste sol = new Estrella("Sol", 1.989e30, 1391016, 5778);
        tierra.mostrarInformacion();
        System.out.println();
        sol.mostrarInformacion();
        }
    }
