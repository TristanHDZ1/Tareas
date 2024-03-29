package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Mineral {
    private int id;
    private String nombre;
    private String dureza;
    private String conductor;
    private String luminoso;
    private String url;

    public Mineral() {
    }
    public Mineral(int id, String nombre, String dureza,String conductor, String luminoso, String url){
        this.id=id;
        this.nombre= nombre;
        this.dureza= dureza;
        this.conductor= conductor;
        this.luminoso= luminoso;
        this.url= url;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getLuminoso() {
        return luminoso;
    }

    public void setLuminoso(String luminoso) {
        this.luminoso = luminoso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Mineral{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dureza='" + dureza + '\'' +
                ", conductor='" + conductor + '\'' +
                ", luminoso='" + luminoso + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImagen =  new URL(this.url);
            return new ImageIcon(urlImagen);
    }

}