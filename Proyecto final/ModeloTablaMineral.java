package org.example.modelo;

import org.example.persistencia.MineralDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaMineral implements TableModel {
    public final int COLUMS =6;
    private ArrayList<Mineral>datos;
    private MineralDAO mdao;

    public ModeloTablaMineral(){
        mdao= new MineralDAO();
        datos= new ArrayList<>();
    }

    public ModeloTablaMineral(ArrayList<Mineral> datos) {
        this.datos = datos;
        mdao= new MineralDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return  "Id";
            case 1:
                return  "Nombre del Mineral";
            case 2:
                return "Dureza";
            case 3:
                return  "Conductor";

            case 4:
                return  "Luminoso";

            case 5:
               return  "URL Imagen";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;


        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mineral tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getDureza();
            case 3:
                return tmp.getConductor();
            case 4:
                return tmp.getLuminoso();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) o);
                break;
            case 2:
                datos.get(rowIndex).setDureza((Integer) o);
                break;
            case 3:
                datos.get(rowIndex).setConductor((String) o);
                break;
            case 4:
                datos.get(rowIndex).setLuminoso((String) o);
            case 5:
                datos.get(rowIndex).setUrl((String) o);
                break;
            default:
                System.out.println("No se puede modicar nada ");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<Mineral> tirar= mdao.obtenerTodo();
            //System.out.println(tirar);
            datos= mdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }
    public boolean agregarMineral(Mineral mineral){
        boolean resultado =  false;
        try {
            if (mdao.insertar(mineral)){
                datos.add(mineral);
                resultado = true;
            }else {
                resultado= false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
