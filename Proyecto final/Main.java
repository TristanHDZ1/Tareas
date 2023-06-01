package org.example;

import org.example.controlador.ControladorMineral;
import org.example.vista.VistaMineral;

public class Main {
    public static void main(String[] args) {
        VistaMineral vistaMineral =  new VistaMineral("Ventana");
        ControladorMineral controller =  new ControladorMineral(vistaMineral);

    }
}