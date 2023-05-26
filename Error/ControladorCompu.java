package org.example.controlador;

import org.example.modelo.Computadora;
import org.example.modelo.ModeloTablaCompu;
import org.example.vista.VentanaComputadora;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorCompu extends MouseAdapter {
     private VentanaComputadora view;
     private ModeloTablaCompu modelo;

     public ControladorCompu (VentanaComputadora view){
          this.view = view;
          view.getBtnAgregar().addMouseListener(this);
          view.getTblComputadora().addMouseListener(this);
          modelo =  new ModeloTablaCompu();
          view.getTblComputadora().setModel(modelo);


     }
     @Override
     public void mouseClicked(MouseEvent e) {
          if (e.getSource()== view.getBtnAgregar()){
               System.out.println("Se dio clic en el boton");
               Computadora temp = new Computadora();
               temp.setMarca(view.getTxtMarca().getText());
               temp.setModelo(view.getTxtModelo().getText());
               temp.getFrecuenciaProcesador(Double.parseDouble(view.getTxtFrecuencia().getText())):
               temp.setURLfoto(view.getTxtUrlFoto().getText());

               modelo.agregarComputadora(temp);
               view.getTblComputadora().updateUI();

          }
          if (e.getSource() == view.getTblComputadora()){
               System.out.println("Click sobre la tabla");
               int rowIndex = view.getTblComputadora().getSelectedRow();
             Computadora temp =  modelo.obtenerComputadora(rowIndex);
             view.getLblImagenCompu().setText("");
             view.getLblImagenCompu().setIcon(temp.createIcon());


          }
     }
}
