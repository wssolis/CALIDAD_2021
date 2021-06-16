/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.modelo.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO SOLIS
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Pilas tienes que poner atención");
         JOptionPane.showMessageDialog(null,Controlador.control());
         JOptionPane.showMessageDialog(null,new Conexion().conectar());
         
    }
    
}
