/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.sql.*; 
import javax.swing.JOptionPane;


/**
 *
 * @author tatia
 */
public class conexion {
    Connection conectar=null;
    public Connection conectar() {
        try {
           Class.forName("com.mysql.jdbc.Driver"); 
           conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes","root","");
           JOptionPane.showMessageDialog(null,"Conexion exitosa","Conexion", JOptionPane.INFORMATION_MESSAGE );
       }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null," Sin Conexion" +e,"Conexion", JOptionPane.ERROR_MESSAGE);
       }
        return conectar;   
    }
}
