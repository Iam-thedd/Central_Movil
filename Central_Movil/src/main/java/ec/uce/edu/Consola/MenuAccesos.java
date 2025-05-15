package ec.uce.edu.Consola;

import java.util.Scanner;

public class MenuAccesos {

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("          GESTIONAR ACCESO");
            System.out.println("====================================");
            System.out.println("1. Crear acceso");
            System.out.println("2. Consultar acceso");
            System.out.println("3. Editar acceso");
            System.out.println("4. Eliminar acceso");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("-> Crear acceso (Gestionar invitados y validar acceso)...");
                    System.out.println("   - Permitir acceso");
                    System.out.println("   - Denegar acceso");
                    break;
                case 2:
                    System.out.println("-> Consultar acceso...");
                    break;
                case 3:
                    System.out.println("-> Editar acceso...");
                    break;
                case 4:
                    System.out.println("-> Eliminar acceso...");
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
