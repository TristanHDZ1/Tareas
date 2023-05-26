package org.example.modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.color.ColorSpace;
import java.util.ArrayList;


public class ModeloTablaCompu  implements TableModel {
    public ModeloTablaCompu() {
        datos = new ArrayList<>();
    }

    public static final int COLS = 4;
    private ArrayList<Computadora> datos;

    public ModeloTablaCompu(ArrayList<Computadora> datos) {

        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Marca";

                case 1:
                    return "Modelo";

                    case 2:
                        return "Frecuencia (GHz)";

                        case 3:
                            return "URL foto";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
                    switch (columnIndex){
                        case 0:
                            return String.class;
                        case 1:
                            return String.class;
                        case 2:
                            return Double.class;
                        case 3:
                            return String.class;

                    }return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Computadora compu = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return compu.getMarca();
            case 1:
                return compu.getModelo();
            case 2:
                return compu.getFrecuenciaProcesador();
            case 3:
                return compu.getURLfoto();


        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setMarca((String) aValue);
                break;
            case 1:
                datos.get(rowIndex).setModelo((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setFrecuenciaProcesador((Double) aValue);
                break;
            case 3:
                datos.get(rowIndex).setURLfoto((String) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarComputadora(Computadora compu){
        datos.add(compu);

    }
    public Computadora obtenerComputadora(int rowIndex)throws IndexOutOfBoundsException{
        return datos.get(rowIndex);

    }
}
