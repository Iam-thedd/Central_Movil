package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.Espacio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEspacios {

    private static List<Espacio> listaEspacios = new ArrayList<>();

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
            teclado.nextLine(); // Limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1:
                    crearEspacio(teclado);
                    break;
                case 2:
                    consultarEspacio(teclado);
                    break;
                case 3:
                    editarEspacio(teclado);
                    break;
                case 4:
                    eliminarEspacio(teclado);
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

    private static void crearEspacio(Scanner teclado) {
        System.out.println("-> Crear espacio");

        String id;
        do {
            System.out.print("ID (formato usuario_facultad_numero, ej: juan_civil_2): ");
            id = teclado.nextLine();
            if (!id.matches("^[a-zA-Z]+_[a-zA-Z]+_[0-9]+$")) {
                System.out.println("Formato inválido. Ejemplo válido: juan_civil_2");
                id = "";
            }
        } while (id.isEmpty());

        System.out.print("Zona de estacionamiento: ");
        String zona = teclado.nextLine();

        String tipo;
        do {
            System.out.print("Tipo (premium o visitante): ");
            tipo = teclado.nextLine().trim().toLowerCase();
            if (!tipo.equals("premium") && !tipo.equals("visitante")) {
                System.out.println("Tipo inválido. Solo se permite 'premium' o 'visitante'.");
                tipo = "";
            }
        } while (tipo.isEmpty());

        String estado;
        do {
            System.out.print("Estado (disponible, no disponible, fuera de servicio): ");
            estado = teclado.nextLine().trim().toLowerCase();
            if (!estado.equals("disponible") && !estado.equals("no disponible") && !estado.equals("fuera de servicio")) {
                System.out.println("Estado inválido. Solo: disponible, no disponible, fuera de servicio.");
                estado = "";
            }
        } while (estado.isEmpty());

        String fecha = LocalDate.now().toString(); // Fecha actual

        Espacio nuevo = new Espacio(id, zona, tipo, estado, fecha);
        listaEspacios.add(nuevo);

        System.out.println("Espacio creado exitosamente.");
    }

    private static void consultarEspacio(Scanner teclado) {
        System.out.println("-> Consultar espacio");

        System.out.print("Ingrese el ID del espacio: ");
        String idBuscado = teclado.nextLine();

        for (Espacio e : listaEspacios) {
            if (e.getId().equalsIgnoreCase(idBuscado)) {
                System.out.println("ID: " + e.getId());
                System.out.println("Zona: " + e.getZonaEstacionamiento());
                System.out.println("Tipo: " + e.getTipo());
                System.out.println("Estado: " + e.getEstado());
                System.out.println("Fecha ocupado: " + e.getFechaOcupado());
                return;
            }
        }

        System.out.println("Espacio no encontrado.");
    }

    private static void editarEspacio(Scanner teclado) {
        System.out.println("-> Editar espacio");

        System.out.print("Ingrese el ID del espacio a editar: ");
        String idEditar = teclado.nextLine();

        for (Espacio e : listaEspacios) {
            if (e.getId().equalsIgnoreCase(idEditar)) {
                System.out.print("Nueva zona de estacionamiento: ");
                e.setZonaEstacionamiento(teclado.nextLine());

                String tipo;
                do {
                    System.out.print("Nuevo tipo (premium o visitante): ");
                    tipo = teclado.nextLine().trim().toLowerCase();
                    if (!tipo.equals("premium") && !tipo.equals("visitante")) {
                        System.out.println("Tipo inválido.");
                        tipo = "";
                    }
                } while (tipo.isEmpty());
                e.setTipo(tipo);

                String estado;
                do {
                    System.out.print("Nuevo estado (disponible, no disponible, fuera de servicio): ");
                    estado = teclado.nextLine().trim().toLowerCase();
                    if (!estado.equals("disponible") && !estado.equals("no disponible") && !estado.equals("fuera de servicio")) {
                        System.out.println("Estado inválido.");
                        estado = "";
                    }
                } while (estado.isEmpty());
                e.setEstado(estado);

                e.setFechaOcupado(LocalDate.now().toString()); // Nueva fecha actual

                System.out.println("Espacio editado correctamente.");
                return;
            }
        }

        System.out.println("Espacio no encontrado.");
    }

    private static void eliminarEspacio(Scanner teclado) {
        System.out.println("-> Eliminar espacio");

        System.out.print("Ingrese el ID del espacio a eliminar: ");
        String idEliminar = teclado.nextLine();

        for (int i = 0; i < listaEspacios.size(); i++) {
            if (listaEspacios.get(i).getId().equalsIgnoreCase(idEliminar)) {
                listaEspacios.remove(i);
                System.out.println("Espacio eliminado correctamente.");
                return;
            }
        }

        System.out.println("Espacio no encontrado.");
    }
}
