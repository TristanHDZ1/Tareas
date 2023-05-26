package org.example;

import org.example.controlador.ControladorCompu;
import org.example.vista.VentanaComputadora;

public class Main {
    public static void main(String[] args) {
        VentanaComputadora ventana = new VentanaComputadora("Ventana");
        ControladorCompu cotroller = new ControladorCompu(ventana);

    }
}