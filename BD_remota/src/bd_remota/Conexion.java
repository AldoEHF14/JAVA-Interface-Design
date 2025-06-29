/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd_remota;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldoh
 */
public class Conexion {

    private final String url = "jdbc:mysql://localhost:3306/alumnosbd";
    private final String usuario = "AldoE";
    private final String pass = "2193035908";
    private Connection con = null;

    public Connection getConexion() throws ClassNotFoundException, SQLException{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(this.url, this.usuario, this.pass);
            System.out.println("Conexion Exitosa");
            
        } catch (HeadlessException e) {
            System.out.println("Error :" + e);
        }
        
        return con;
    }

}
