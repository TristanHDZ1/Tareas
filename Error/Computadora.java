package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Computadora {
    private String marca;
    private String modelo;
    private double frecuenciaProcesador;
    private String URLfoto;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, double frecuenciaProcesador, String URLfoto) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuenciaProcesador = frecuenciaProcesador;
        this.URLfoto = URLfoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuenciaProcesador() {
        return frecuenciaProcesador;
    }

    public void setFrecuenciaProcesador(double frecuenciaProcesador) {
        this.frecuenciaProcesador = frecuenciaProcesador;
    }

    public String getURLfoto() {
        return URLfoto;
    }

    public void setURLfoto(String URLfoto) {
        this.URLfoto = URLfoto;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuenciaProcesador=" + frecuenciaProcesador +
                ", URLfoto='" + URLfoto + '\'' +
                '}';
    }
    public ImageIcon createIcon() {
        ImageIcon resultado = null;
        try {
            URL urlImagen = new URL(this.URLfoto);
            resultado = new ImageIcon(urlImagen);
        } catch (MalformedURLException mue) {
            System.out.println(mue.toString());
        }
        return resultado;
    }


}
