package ec.uce.edu.Consola;

import java.util.Scanner;

public class MenuCodigoQR {

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("      GESTIONAR CODIGO QR");
            System.out.println("====================================");
            System.out.println("1. Crear codigo QR");
            System.out.println("2. Consultar codigo QR");
            System.out.println("3. Editar codigo QR");
            System.out.println("4. Eliminar codigo QR");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("-> Crear codigo QR (incluye temporal)...");
                    break;
                case 2:
                    System.out.println("-> Consultar codigo QR...");
                    break;
                case 3:
                    System.out.println("-> Editar codigo QR...");
                    break;
                case 4:
                    System.out.println("-> Eliminar codigo QR...");
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