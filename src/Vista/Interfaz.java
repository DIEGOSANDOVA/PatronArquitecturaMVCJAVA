
package Vista;

import Modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Interfaz {

    private Scanner scanner;

    public Interfaz() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Crear usuario");
        System.out.println("2. Mostrar detalles de usuario");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");

        return scanner.nextInt();
    }

    public Usuario crearUsuario() {
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del usuario: ");
        int edad = scanner.nextInt();

        return new Usuario(nombre, edad);
    }

    public void mostrarDetallesUsuario(Usuario usuario) {
        System.out.println("Detalles del usuario:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Edad: " + usuario.getEdad());
    }
}

