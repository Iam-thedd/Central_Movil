package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        do {
            System.out.println("====================================");
            System.out.println("     SISTEMA DE CONTROL CENTRAL");
            System.out.println("====================================");
            System.out.println("1. Gestionar usuarios");
            System.out.println("2. Gestionar zonas");
            System.out.println("3. Gestionar espacios");
            System.out.println("4. Gestionar accesos");
            System.out.println("5. escaneo QR)");
            System.out.println("0. Salir del sistema");
            System.out.print("Seleccione una opcion: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número.");
                teclado.next();
                System.out.print("Seleccione una opcion: ");
            }

            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1:
                    MenuUsuarios.mostrarMenu(teclado, listaUsuarios);
                    break;
                case 2:
                    MenuZonas.mostrarMenu(teclado);
                    break;
                case 3:
                    MenuEspacios.mostrarMenu(teclado);
                    break;
                case 4:
                    MenuAccesos.mostrarMenu(teclado);
                    break;
                case 5:
                    MenuCodigoQR.mostrarMenu(teclado);
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
