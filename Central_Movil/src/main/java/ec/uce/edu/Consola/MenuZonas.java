package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.ZonaEstacionamiento;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuZonas {

    private static ArrayList<ZonaEstacionamiento> listaZonas = new ArrayList<>();

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         GESTIONAR ZONAS");
            System.out.println("====================================");
            System.out.println("1. Crear zona");
            System.out.println("2. Consultar zonas");
            System.out.println("3. Editar zona");
            System.out.println("4. Eliminar zona");
            System.out.println("5. Asignar zona");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1: // Crear zona
                    ZonaEstacionamiento nueva = new ZonaEstacionamiento();

                    String idZona;
                    boolean idValido;
                    do {
                        idValido = true;
                        System.out.print("Ingrese ID de zona (formato: Letra + 3 dígitos, ej. A123): ");
                        idZona = teclado.nextLine();

                        if (!idZona.matches("^[a-zA-Z]{1}\\d{3}$")) {
                            System.out.println("ID inválido. Debe tener una letra seguida de 3 dígitos (ej. A123, b456).");
                            idValido = false;
                            continue;
                        }

                        for (ZonaEstacionamiento z : listaZonas) {
                            if (String.valueOf(z.getIdZona()).equalsIgnoreCase(idZona)) {
                                System.out.println("Ya existe una zona con ese ID.");
                                idValido = false;
                                break;
                            }
                        }
                    } while (!idValido);
                    nueva.setIdZona(idZona.hashCode()); // Guardamos como int, pero basado en string

                    // Validación del nombre con formato nombre_numero
                    String facultad;
                    do {
                        System.out.print("Ingrese nombre de la facultad (formato: nombre_numero): ");
                        facultad = teclado.nextLine();
                        if (!facultad.matches("^[a-zA-Z]+_[0-9]+$")) {
                            System.out.println("Formato inválido. Ejemplos válidos: civil_2, mecanica_1");
                        }
                    } while (!facultad.matches("^[a-zA-Z]+_[0-9]+$"));
                    nueva.setFacultad(facultad);

                    System.out.print("Ingrese capacidad total: ");
                    int capacidad;
                    do {
                        capacidad = teclado.nextInt();
                        if (capacidad <= 0) {
                            System.out.println("La capacidad debe ser positiva.");
                        }
                    } while (capacidad <= 0);
                    nueva.setCapacidadTotal(capacidad);
                    nueva.setEspaciosDisponibles(capacidad);

                    listaZonas.add(nueva);
                    System.out.println("Zona creada correctamente.");
                    break;

                case 2: // Consultar zonas
                    if (listaZonas.isEmpty()) {
                        System.out.println("No hay zonas registradas.");
                    } else {
                        System.out.println("Listado de zonas:");
                        for (ZonaEstacionamiento zona : listaZonas) {
                            System.out.println("ID: " + zona.getIdZona() + " | Facultad: " + zona.getFacultad()
                                    + " | Capacidad: " + zona.getCapacidadTotal()
                                    + " | Disponibles: " + zona.getEspaciosDisponibles());
                        }
                    }
                    break;

                case 3: // Editar zona
                    System.out.print("Ingrese el ID de la zona a editar (como número hash): ");
                    int idEditar = teclado.nextInt();
                    teclado.nextLine();
                    boolean encontradoEditar = false;

                    for (ZonaEstacionamiento zona : listaZonas) {
                        if (zona.getIdZona() == idEditar) {
                            System.out.print("Nueva facultad: ");
                            zona.setFacultad(teclado.nextLine());

                            System.out.print("Nueva capacidad: ");
                            int nuevaCap;
                            do {
                                nuevaCap = teclado.nextInt();
                                if (nuevaCap <= 0) {
                                    System.out.println("La capacidad debe ser positiva.");
                                }
                            } while (nuevaCap <= 0);

                            zona.setCapacidadTotal(nuevaCap);
                            zona.setEspaciosDisponibles(nuevaCap); // opcional

                            System.out.println("Zona actualizada.");
                            encontradoEditar = true;
                            break;
                        }
                    }

                    if (!encontradoEditar) {
                        System.out.println("Zona no encontrada.");
                    }
                    break;

                case 4: // Eliminar zona
                    System.out.print("Ingrese el ID de la zona a eliminar (como número hash): ");
                    int idEliminar = teclado.nextInt();
                    boolean eliminado = listaZonas.removeIf(z -> z.getIdZona() == idEliminar);

                    if (eliminado) {
                        System.out.println("Zona eliminada correctamente.");
                    } else {
                        System.out.println("Zona no encontrada.");
                    }
                    break;

                case 5: // Asignar zona
                    System.out.print("Ingrese el ID de la zona a asignar (como número hash): ");
                    int idAsignar = teclado.nextInt();
                    teclado.nextLine();
                    boolean encontradoAsignar = false;

                    for (ZonaEstacionamiento zona : listaZonas) {
                        if (zona.getIdZona() == idAsignar) {
                            System.out.println("Zona encontrada en la facultad: " + zona.getFacultad());
                            System.out.println("Seleccione tipo:");
                            System.out.println("1. Premium");
                            System.out.println("2. Preferencial");
                            int tipo = teclado.nextInt();
                            teclado.nextLine();

                            String tipoZona = (tipo == 1) ? "Premium" : "Preferencial";
                            System.out.println("Asignado tipo de zona: " + tipoZona);

                            System.out.println("Registrando ingreso y notificando usuario...");
                            encontradoAsignar = true;
                            break;
                        }
                    }

                    if (!encontradoAsignar) {
                        System.out.println("Zona no encontrada.");
                    }
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
