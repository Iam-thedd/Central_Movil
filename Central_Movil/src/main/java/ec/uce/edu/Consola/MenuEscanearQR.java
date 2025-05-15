package ec.uce.edu.Consola;

import java.util.Scanner;

public class MenuEscanearQR {

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("        ESCANEAR CODIGO QR");
            System.out.println("====================================");
            System.out.println("1. Solicitar acceso con QR");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("-> Solicitar acceso con codigo QR...");
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
