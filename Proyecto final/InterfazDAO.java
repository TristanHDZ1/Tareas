package org.example.persistencia;

import org.xml.sax.SAXException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDAO {
    public abstract boolean insertar (Object obj)throws SQLException;
    public abstract boolean update(Object obj)throws SQLException;
    public abstract boolean delete (String id)throws SAXException;
    public abstract ArrayList obtenerTodo() throws SQLException;
    public abstract Object buscarPorID(String id)throws SQLException;
}

