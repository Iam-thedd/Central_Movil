package ec.uce.edu.Consola;

import java.util.Scanner;

public class MenuEspacios {

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         GESTIONAR ESPACIOS");
            System.out.println("====================================");
            System.out.println("1. Crear espacio");
            System.out.println("2. Consultar espacio");
            System.out.println("3. Editar espacio");
            System.out.println("4. Eliminar espacio");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("-> Crear espacio...");
                    break;
                case 2:
                    System.out.println("-> Consultar espacio...");
                    break;
                case 3:
                    System.out.println("-> Editar espacio...");
                    break;
                case 4:
                    System.out.println("-> Eliminar espacio...");
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println();
        } while (opcion != 0);
    }
}
