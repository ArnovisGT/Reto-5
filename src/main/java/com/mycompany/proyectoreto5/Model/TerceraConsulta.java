
package com.mycompany.proyectoreto5.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class TerceraConsulta {
    public void terceraconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        
        ClienteProveedor clienteProveedor = new ClienteProveedor();
        
        try {
            //Establecer la conexcion a la base de datos:
            
            Conexion conexcion = new Conexion();
            Connection cn = conexcion.conectar();
                    
            //Cadena de consulta
            
            String sql = "SELECT ID_Compra, p.Constructora, p.Banco_Vinculado "
                    + "FROM Compra c JOIN Proyecto p ON "
                    + "(c.ID_Proyecto=p.ID_Proyecto)"
                    + "WHERE Proveedor = 'Homecenter' AND p.Ciudad='Salento' ";
            Statement query = cn.createStatement();
            ResultSet resulta = query.executeQuery(sql);
            
            while (resulta.next()) {
                clienteProveedor.setID_compra(resulta.getInt(1));
                clienteProveedor.setConstructora(resulta.getString(2));
                clienteProveedor.setBanco(resulta.getString(3));
               
            
           //Adicion de la informacion recibida a la tabla de datos
           
           modelo.addRow(new Object[]{clienteProveedor.getID_compra(),
               clienteProveedor.getConstructora(),clienteProveedor.getBanco()});
        }
            //Cerrar Intancias Statement y ResultSet
            
            resulta.close();
            query.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    
}
    
}
