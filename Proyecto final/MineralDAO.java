package org.example.persistencia;

import org.example.modelo.Mineral;
import org.xml.sax.SAXException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MineralDAO implements InterfazDAO{
    public MineralDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO minerales(nombre,dureza,conductor,luminoso,url) VALUES(?,?)";
        int rowCount= 0;
        PreparedStatement pstm= ConexionSingleton.getInstance("mineralesDB.db").getConnection().prepareStatement(sqlInsert);
       pstm.setString(1,((Mineral) obj).getNombreDelMineral());
       pstm.setInt(2,((Mineral) obj).getDureza());
        pstm.setString(3,((Mineral) obj).getConductor());
        pstm.setString(4,((Mineral) obj).getLuminoso());
        pstm.setString(5,((Mineral) obj).getUrlImagen());
      rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE minerales SET nombre=?,dureza=?,conductor=?,luminoso=?,url=? WHERE id=?;";
        int rowCout=0;
        PreparedStatement pstm= ConexionSingleton.getInstance("mineralesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Mineral)obj).getNombreDelMineral());
        pstm.setInt(2,((Mineral)obj).getDureza());
        pstm.setString(3,((Mineral)obj).getConductor());
        pstm.setString(4,((Mineral)obj).getLuminoso());
        pstm.setString(5,((Mineral)obj).getUrlImagen());
        pstm.setInt(6,((Mineral)obj).getId());
        return rowCout>0;
    }

    @Override
    public boolean delete(String id) throws SAXException {
        String sqlDelete = "DELETE FROM mineraales WHRERE id = ? ;";
        int rowCout= 0;
        PreparedStatement pstm= null;
        try {
            pstm = ConexionSingleton.getInstance("mineralesDB.db").getConnection().prepareStatement(sqlDelete);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            pstm.setInt(1,Integer.parseInt(id));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowCout >0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
            String sql = "SELECT * FROM minerales";
            ArrayList<Mineral>resultados= new ArrayList<>();
        Statement stm=ConexionSingleton.getInstance("mineralesDB.db").getConnection().createStatement();
        ResultSet rts =stm.executeQuery(sql);
        while (rts.next()){
            resultados.add(new Mineral(rts.getInt(1),rts.getString(2), rts.getInt(3),rts.getString(4), rts.getNString(5), rts.getNString(6) ));
        }
        return resultados;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        String sql= "SELECT * FROM minerales WHERE id =? ;";
        Mineral mineral=null;
        Statement pstm=ConexionSingleton.getInstance("mineralesDB.db").getConnection().prepareStatement(sql);

        return null;
    }
}

