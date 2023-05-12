package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo  implements ComboBoxModel {
    //objetos que utilizare
    ArrayList<String>datos;
    String selected;

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    public NombreModeloCombo(ArrayList<String> datos, String selected) {
        this.datos = datos;
        this.selected = selected;
    }

    @Override
    public void setSelectedItem(Object o) {
    this.selected = (String) o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void agregarNombre(String nom){
        datos.add(nom);

    }}
