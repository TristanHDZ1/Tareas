package org.example.controlador;

import org.example.modelo.Mineral;
import org.example.modelo.ModeloTablaMineral;
import org.example.vista.VistaMineral;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorMineral extends MouseAdapter {
    private VistaMineral view;
    private ModeloTablaMineral modelo;
    public ControladorMineral (VistaMineral view) {
        this.view = view;
        modelo= new ModeloTablaMineral();
        this.view.getTblMineral().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
            System.out.println("Click sobre la tabla");
            view.getLblImagenMineral().setText("");
            modelo.cargarDatos();
            this.view.getTblMineral().setModel(modelo);
            this.view.getTblMineral().updateUI();

        }
        if (e.getSource() == this.view.getBtnAgregar()){
            Mineral mineral = new Mineral();
            mineral.setId(0);
            mineral.setNombre(this.view.getTxtNombreMineral().getText());
            mineral.setDureza(0);
            mineral.setConductor(this.view.getTxtConductor().getText());
            mineral.setLuminoso(this.view.getTxtLuminoso().getText());
            mineral.setUrl(this.view.getTxtUrlFoto().getText());

            if (modelo.agregarMineral(mineral)){
                JOptionPane.showMessageDialog(view,
                        "Se agrego",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblMineral().updateUI();

            } else {JOptionPane.showMessageDialog(view,
                    "No se agrego,revise su conexxion con su base de datos",
                    "Error al insertar",JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }
    }
}