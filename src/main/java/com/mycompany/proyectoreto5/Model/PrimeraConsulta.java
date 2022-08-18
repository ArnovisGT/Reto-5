
package com.mycompany.proyectoreto5.Model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PrimeraConsulta {
    
    public void primeraconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        
        Lider lider = new Lider();
        
        try {
            //Establecer la conexcion a la base de datos:
            
            Conexion conexcion = new Conexion();
            Connection cn = conexcion.conectar();
                    
            //Cadena de consulta
            
            String sql = "SELECT ID_lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";
            Statement query = cn.createStatement();
            ResultSet resulta = query.executeQuery(sql);
            
            while (resulta.next()) {
                lider.setID_lider(resulta.getInt(1));
                lider.setNombre(resulta.getString(2));
                lider.setPrimer_Apellido(resulta.getString(3));
                lider.setCiudad_Residencia(resulta.getString(4));
               
            
           //Adicion de la informacion recibida a la tabla de datos
           
            modelo.addRow(new Object[]{lider.getID_lider(),lider.getNombre(),lider.getPrimer_Apellido(),lider.getCiudad_Residencia()});
        }
            //Cerrar Intancias Statement y ResultSet
            
            resulta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    }
}
