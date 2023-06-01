package org.example.controlador;

import org.example.modelo.Mineral;
import org.example.modelo.ModeloTablaMineral;
import org.example.vista.VistaMineral;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorMineral extends MouseAdapter {
    private VistaMineral view;
    private ModeloTablaMineral modelo;
    public ControladorMineral(VistaMineral view){
        this.view= view;
        modelo= new ModeloTablaMineral();
        this.view.getTblMineral().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==this.view.getBtnCargar()){
            System.out.println("Click sobre la tabla");
            int rowIndex =  view.getTblMineral().getSelectedRow();
            //Mineral min =  modelo.obtenerMineral(rowIndex);
            view.getLblImagenMineral().setText("");
            //view.getLblImagenMineral().setIcon(min.);

            modelo.cargarDatos();
            this.view.getTblMineral().setModel(modelo);
            this.view.getTblMineral().updateUI();
        }
        if (e.getSource()==this.view.getBtnAgregar()){
            Mineral mineral =  new Mineral();
            mineral.setId(0);
            mineral.setNombreDelMineral(this.view.getTxtNombreMinreal().getText());
            mineral.setDureza(0);
            mineral.setConductor(this.view.getTxtConductor().getText());
            mineral.setLuminoso(this.view.getTxtLuminoso().getText());
            mineral.setUrlImagen(this.view.getTxtUrlFoto().getText());

            if (modelo.agregarMinera(mineral)){
                JOptionPane.showMessageDialog(view,
                        "Se agrego",
                        "Operacion Existosa",
                        JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblMineral().updateUI();

            } else{
                JOptionPane.showMessageDialog(view,
                        "No se agrego correctamente",
                        "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();


        }
    }
}