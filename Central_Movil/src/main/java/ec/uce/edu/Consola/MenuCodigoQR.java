package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.CodigoQR;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuCodigoQR {

    private static ArrayList<CodigoQR> listaCodigos = new ArrayList<>();

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("        GESTIONAR CÓDIGO QR");
            System.out.println("====================================");
            System.out.println("1. Crear código QR");
            System.out.println("2. Consultar códigos QR");
            System.out.println("3. Editar código QR");
            System.out.println("4. Eliminar código QR");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1: // Crear QR
                    System.out.print("Ingrese el código QR leído (por favor, escanee el código QR o ingréselo manualmente): ");
                    String codigo = teclado.nextLine();

                    // Simular la generación de un código QR (lo puedes cambiar según la lógica real)
                    String codigoSimulado = "QR-" + (int) (Math.random() * 1000000); // Genera un QR simulado
                    System.out.println("Mira tu código QR aquí: " + codigoSimulado); // Muestra el QR simulado al usuario

                    // Validar si el código ingresado por el usuario coincide con el QR simulado
                    CodigoQR nuevo = new CodigoQR();
                    if (nuevo.validarFormato(codigo)) {
                        nuevo.setCodigoLeido(codigo);
                        nuevo.setFechaEscaneo(new Date());
                        listaCodigos.add(nuevo);
                        System.out.println("✅ Código QR registrado correctamente.");
                    } else {
                        System.out.println("❌ Formato de código QR no válido.");
                    }
                    break;

                case 2: // Consultar QR
                    if (listaCodigos.isEmpty()) {
                        System.out.println("No hay códigos QR registrados.");
                    } else {
                        System.out.println("Listado de Códigos QR:");
                        int i = 1;
                        for (CodigoQR c : listaCodigos) {
                            System.out.println(i + ". Código: " + c.getCodigoLeido()
                                    + " | Fecha de escaneo: " + c.getFechaEscaneo());
                            i++;
                        }
                    }
                    break;

                case 3: // Editar QR
                    System.out.print("Ingrese el número del código QR a editar: ");
                    int numEditar = teclado.nextInt();
                    teclado.nextLine();

                    if (numEditar >= 1 && numEditar <= listaCodigos.size()) {
                        CodigoQR codigoEditar = listaCodigos.get(numEditar - 1);

                        System.out.print("Nuevo código QR: ");
                        String nuevoCodigo = teclado.nextLine();

                        if (codigoEditar.validarFormato(nuevoCodigo)) {
                            codigoEditar.setCodigoLeido(nuevoCodigo);
                            codigoEditar.setFechaEscaneo(new Date());
                            System.out.println("Código QR actualizado.");
                        } else {
                            System.out.println("Formato inválido. No se actualizó.");
                        }
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4: // Eliminar QR
                    System.out.print("Ingrese el número del código QR a eliminar: ");
                    int numEliminar = teclado.nextInt();

                    if (numEliminar >= 1 && numEliminar <= listaCodigos.size()) {
                        listaCodigos.remove(numEliminar - 1);
                        System.out.println("Código QR eliminado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
