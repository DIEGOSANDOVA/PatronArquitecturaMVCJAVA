/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.Interfaz;

/**
 *
 * @author diego
 */
public class ControladorUsuario {
    
    private Interfaz vista;
    private Usuario usuario;

    public ControladorUsuario(Interfaz vista) {
        this.vista = vista;
        this.usuario = null;
    }

    public void ejecutar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    usuario = vista.crearUsuario();
                    break;
                case 2:
                    if (usuario != null) {
                        vista.mostrarDetallesUsuario(usuario);
                    } else {
                        System.out.println("No se ha creado ningún usuario.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }
}

