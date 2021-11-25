/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Conectar {
    
    /* Connection cn;
    
    public Connection conexion(){
    
        
        try {
             Class.forName("org.postgresql.Driver");
            
            String url="jdbc:postgresql://localhost:5432/postgres";
            
            
            cn=DriverManager.getConnection(url,"postgres","admin");
            
            System.out.println("conectado");
        } catch (SQLException e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e); 
        }
        catch (ClassNotFoundException e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e.getMessage());
       
        }
        return cn;
    }*/
   Connection cn;
    
    public Connection conexion() {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    
                    cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
                    JOptionPane.showMessageDialog(null, "Se conecto correctamente");
                    
                    System.out.print("conectar");
        } catch (Exception e) {
            
            System.err.println(e.getMessage());
      
 
    }
        return cn;
}
}
