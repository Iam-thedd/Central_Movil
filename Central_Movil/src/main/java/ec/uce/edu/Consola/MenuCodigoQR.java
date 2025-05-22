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
            while (!teclado.hasNextInt()) {
                System.out.print("Entrada inválida. Seleccione una opción numérica: ");
                teclado.next(); // Limpiar entrada inválida
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1: // Crear QR
                    // Simular la generación de un código QR
                    String codigoSimulado = "QR-" + (int) (Math.random() * 1000000);
                    System.out.println("Mira tu código QR aquí: " + codigoSimulado);
                    System.out.print("Por favor, ingrese el código QR exactamente como aparece: ");
                    String codigoIngresado = teclado.nextLine();

                    CodigoQR nuevo = new CodigoQR();
                    if (!codigoIngresado.equals(codigoSimulado)) {
                        System.out.println("❌ El código ingresado no coincide con el código generado.");
                    } else if (nuevo.validarFormato(codigoIngresado)) {
                        nuevo.setCodigoLeido(codigoIngresado);
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
                    try {
                        System.out.print("Ingrese el número del código QR a editar: ");
                        int numEditar = Integer.parseInt(teclado.nextLine());

                        if (numEditar >= 1 && numEditar <= listaCodigos.size()) {
                            CodigoQR codigoEditar = listaCodigos.get(numEditar - 1);

                            System.out.print("Nuevo código QR: ");
                            String nuevoCodigo = teclado.nextLine();

                            if (codigoEditar.validarFormato(nuevoCodigo)) {
                                codigoEditar.setCodigoLeido(nuevoCodigo);
                                codigoEditar.setFechaEscaneo(new Date());
                                System.out.println("✅ Código QR actualizado.");
                            } else {
                                System.out.println("❌ Formato inválido. No se actualizó.");
                            }
                        } else {
                            System.out.println("❌ Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Entrada inválida. Debe ingresar un número.");
                    }
                    break;

                case 4: // Eliminar QR
                    try {
                        System.out.print("Ingrese el número del código QR a eliminar: ");
                        int numEliminar = Integer.parseInt(teclado.nextLine());

                        if (numEliminar >= 1 && numEliminar <= listaCodigos.size()) {
                            listaCodigos.remove(numEliminar - 1);
                            System.out.println("✅ Código QR eliminado.");
                        } else {
                            System.out.println("❌ Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Entrada inválida. Debe ingresar un número.");
                    }
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

            System.out.println();

        } while (opcion != 0);
    }
}
