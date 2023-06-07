package org.example.controlador;

import org.example.modelo.Mineral;
import org.example.modelo.ModeloTablaMineral;
import org.example.vista.VistaMineral;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.MalformedURLException;

public class ControladorMineral extends MouseAdapter {
    private VistaMineral view;
    private ModeloTablaMineral modelo;

    public ControladorMineral(VistaMineral view) {
        this.view = view;
        modelo = new ModeloTablaMineral();
        this.view.getTblMineral().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Tabla
        if (e.getSource() == this.view.getTblMineral()) {
            System.out.println("Evento sobre la tabla");
            int index = this.view.getTblMineral().getSelectedRow();
            Mineral tmp = modelo.getMineralAtIndex(index);
            try {
                this.view.getFoto().setIcon(tmp.getImagen());
                this.view.getFoto().setText("");
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }
        }

        //Cargar
        if (e.getSource() == this.view.getBtnCargar()) {
            System.out.println("Eventon sobre cargar");
            modelo.cargarDatos();
            this.view.getTblMineral().setModel(modelo);
            this.view.getTblMineral().updateUI();
        }

        //Agregar
        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Evento sobre el boton agregar");
            Mineral mineral = new Mineral();
            mineral.setId(0);
            mineral.setNombre(this.view.getTxtNombreMineral().getText());
            mineral.setDureza(this.view.getTxtDureza().getText());
            mineral.setConductor(this.view.getTxtConductor().getText());
            mineral.setLuminoso(this.view.getTxtLuminoso().getText());
            mineral.setUrl(this.view.getTxtUrlFoto().getText());

            if (modelo.agregarMineral(mineral)) {
                ImageIcon icono = new ImageIcon("like.png");
                JOptionPane.showMessageDialog(view,
                        "Se agrego correctamente",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE, icono);
                this.view.getTblMineral().updateUI();
            } else {
                ImageIcon icono1 = new ImageIcon("error.png");
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar",
                        "Error de insertar",
                        JOptionPane.ERROR_MESSAGE, icono1);
            }

        }

        //Actualizar
        if (e.getSource() == this.view.getBtnActualizar()) {
            System.out.println("Evento sobre el boton Actualizar");
            int rowIndex = this.view.getTblMineral().getSelectedRow();
            Mineral tmp = modelo.getMineralAtIndex(rowIndex);
            Mineral mineral = new Mineral();
            mineral.setId(tmp.getId());
            mineral.setNombre(this.view.getTxtNombreMineral().getText());
            mineral.setDureza(this.view.getTxtDureza().getText());
            mineral.setConductor(this.view.getTxtConductor().getText());
            mineral.setLuminoso(this.view.getTxtLuminoso().getText());
            mineral.setUrl(this.view.getTxtUrlFoto().getText());
            mineral.setId(tmp.getId());

            if (modelo.actualizarData(mineral)) {
                System.out.println("Evento sobre actualizar");
                ImageIcon icono = new ImageIcon("like.png");
                JOptionPane.showMessageDialog(view, "Se actualizo", "Aviso", JOptionPane.INFORMATION_MESSAGE,icono);
                modelo.cargarDatos();
                this.view.getTblMineral().setModel(modelo);
                this.view.getTblMineral().updateUI();
            } else {
                ImageIcon icono1 = new ImageIcon("error.png");
                JOptionPane.showMessageDialog(view, "No se puede actualizar", "Aviso", JOptionPane.ERROR_MESSAGE,icono1);
            }
            this.view.getTblMineral().updateUI();
        }


        //Eliminar
        if (e.getSource() == this.view.getBtnEliminar()) {
            System.out.println("Evento sobre eliminar");
            int index = this.view.getTblMineral().getSelectedRow();
            Mineral mineral = modelo.getMineralAtIndex(index);

            if (modelo.eliminarData(Integer.toString(mineral.getId()))){
                ImageIcon icono = new ImageIcon("like.png");
                JOptionPane.showMessageDialog(view,"Se elimino", "Aviso", JOptionPane.INFORMATION_MESSAGE,icono);
                modelo.cargarDatos();
                this.view.getTblMineral().updateUI();
                this.view.limpiar();
            } else {
                ImageIcon icono1 = new ImageIcon("error.png");
                JOptionPane.showMessageDialog(view, "No se  pudo elimino", "Aviso", JOptionPane.ERROR_MESSAGE,icono1);
            }
        }

    this.view.limpiar();

    }
}



