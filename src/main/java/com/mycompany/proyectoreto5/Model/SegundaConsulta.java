/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoreto5.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;

public class SegundaConsulta {
    public void segundaconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        
        Proyecto proyecto = new Proyecto();
        
        try {
            //Establecer la conexcion a la base de datos:
            
            Conexion conexcion = new Conexion();
            Connection cn = conexcion.conectar();
                    
            //Cadena de consulta
            
            String sql = "SELECT ID_proyecto, Constructora, Numero_Habitaciones,"
                    + " Ciudad FROM  Proyecto WHERE Clasificacion = 'Casa Campestre' AND CIUDAD IN('Santa Marta',"
                    + "'Cartagena', 'Barranquilla') ";
            Statement query = cn.createStatement();
            ResultSet resulta = query.executeQuery(sql);
            
            while (resulta.next()) {
                proyecto.setID_proyecto(resulta.getInt(1));
                proyecto.setConstructora(resulta.getString(2));
                proyecto.setNumero_Habitaciones(resulta.getInt(3));
                proyecto.setCiudad(resulta.getString(4));
               
            
           //Adicion de la informacion recibida a la tabla de datos
           
           modelo.addRow(new Object[]{proyecto.getID_proyecto(),
                    proyecto.getConstructora(), proyecto.getNumero_Habitaciones(),
                    proyecto.getCiudad()});
        }
            //Cerrar Intancias Statement y ResultSet
            
            resulta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    
}
    
}
