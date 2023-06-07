/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.ControladorUsuario;
import Vista.Interfaz;

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        ControladorUsuario controlador = new ControladorUsuario(vista);
        controlador.ejecutar();
    }
}

