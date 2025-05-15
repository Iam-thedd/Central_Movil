package ec.uce.edu.Consola;

import java.util.Scanner;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         MENU PRINCIPAL");
            System.out.println("====================================");
            System.out.println("1. Gestionar codigo QR");
            System.out.println("2. Gestionar usuarios");
            System.out.println("3. Gestionar zonas");
            System.out.println("4. Gestionar espacio");
            System.out.println("5. Gestionar acceso");
            System.out.println("6. Escanear codigo QR");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    MenuCodigoQR.mostrarMenu(teclado);
                    break;
                case 2:
                    MenuUsuarios.mostrarMenu(teclado);
                    break;
                case 3:
                    MenuZonas.mostrarMenu(teclado);
                    break;
                case 4:
                    MenuEspacios.mostrarMenu(teclado);
                    break;
                case 5:
                    MenuAccesos.mostrarMenu(teclado);
                    break;
                case 6:
                    MenuEscanearQR.mostrarMenu(teclado);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println();
        } while (opcion != 0);

        teclado.close();
    }
}
