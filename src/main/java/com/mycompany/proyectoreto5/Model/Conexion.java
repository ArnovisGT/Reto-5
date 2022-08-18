
package com.mycompany.proyectoreto5.Model;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conectar = null;
    
    public Connection conectar() throws ClassNotFoundException{
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conectar;
    }
    
    
}
