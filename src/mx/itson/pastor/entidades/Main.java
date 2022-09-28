/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pastor.entidades;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import mx.itson.pastor.persistencia.ClienteDAO;
import mx.itson.pastor.persistencia.Conexion;
import mx.itson.pastor.presentacion.Listado;
import com.formdev.flatlaf.FlatDarkLaf;

/**
 *
 * @author gerardo
 */

public class Main {
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        new Listado().setVisible(true);
        System.out.println(ClienteDAO.existeEmail("julio@gmail.com"));
    }
}
