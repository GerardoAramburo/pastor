/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pastor.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gerardo
 */
public class Conexion {
    static String url = "jdbc:mysql://127.0.0.1/pastor_db";
    static String user = "root";
    static String pass = "gerardo1";
    
    public static Connection obtener() {
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pastor_db?user=root&password=gerardo1");
            System.out.println("Conexion exitosa");
        } catch(Exception ex) {
            System.err.print(ex.getMessage());
        }
        
        return conexion;
    }
}
