package org.example.controlador;

import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo  extends MouseAdapter {
    private Ventana view;

    public  ControladorEjemplo(Ventana view){
        this.view= view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==view.getBtnMensaje()){
            //System.out.println("Mensaje");
            //Emjemplos

            //Mensaje Normal
            //JOptionPane.showMessageDialog(view,"Hola desde el ejemplo");
            ImageIcon icon = new ImageIcon("Clave.png");
            JOptionPane.showMessageDialog(view,
                    "Hola amigos",
                    "Titulo personalizado",
                    JOptionPane.WARNING_MESSAGE,
                    icon
                    );
        }

        //Imput
        if(e.getSource()==view.getBtnEntrada()){
            //System.out.println("Entrada");

            String datos = JOptionPane.showInputDialog(view,"Ejemplo de entrada",
                    "Titulo Personalizado",
                    JOptionPane.ERROR_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }

        //Opciones
        if(e.getSource()==view.getBtnOpcion()){
           // System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(view,
                    "Estas seguro de borrar el registro?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);
            //En vez de poner numeros en Yes=0 y No=1 Pone los valores
            view.getLblResultado().setText(""+ respuesta);
            if (respuesta==JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste opcion SI");
            }else {
                view.getLblResultado().setText("Elegiste opcion NO");
            }
        }
    }
}
