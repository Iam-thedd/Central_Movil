package ec.uce.edu.Consola;

import java.util.Scanner;

public class MenuZonas {

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         GESTIONAR ZONAS");
            System.out.println("====================================");
            System.out.println("1. Crear zona");
            System.out.println("2. Consultar zona");
            System.out.println("3. Editar zona");
            System.out.println("4. Eliminar zona");
            System.out.println("5. Asignar zona");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("-> Crear zona...");
                    break;
                case 2:
                    System.out.println("-> Consultar zona...");
                    break;
                case 3:
                    System.out.println("-> Editar zona...");
                    break;
                case 4:
                    System.out.println("-> Eliminar zona...");
                    break;
                case 5:
                    System.out.println("-> Asignar zona:");
                    System.out.println("   - Premium");
                    System.out.println("   - Preferencial");
                    System.out.println("   - Registrar ingreso y notificar usuario");
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
