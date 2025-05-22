package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MenuUsuarios {

    public static void mostrarMenu(Scanner teclado, ArrayList<Usuario> listaUsuarios) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         GESTIONAR USUARIOS");
            System.out.println("====================================");
            System.out.println("1. Crear usuario");
            System.out.println("2. Consultar usuario");
            System.out.println("3. Editar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número.");
                teclado.next();
                System.out.print("Seleccione una opcion: ");
            }

            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1:
                    String nombre;
                    do {
                        System.out.print("Ingrese nombre del usuario: ");
                        nombre = teclado.nextLine().trim();

                        if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                            System.out.println("Nombre inválido. Solo se permiten letras y espacios.");
                            nombre = "";
                        }
                    } while (nombre.isEmpty());

                    String tipo;
                    do {
                        System.out.print("Ingrese tipo de usuario (admin, visitante, guardia, estudiante): ");
                        tipo = teclado.nextLine().trim().toLowerCase();
                        if (!tipo.equals("admin") && !tipo.equals("visitante") && !tipo.equals("guardia") && !tipo.equals("estudiante")) {
                            System.out.println("Tipo inválido. Debe ser uno de: admin, visitante, guardia, estudiante.");
                            tipo = "";
                        }
                    } while (tipo.isEmpty());

                    String id = UUID.randomUUID().toString();
                    String qr = "QR-" + id.substring(0, 5).toUpperCase();
                    String fecha = java.time.LocalDate.now().toString();

                    Usuario nuevo = new Usuario(id, nombre, tipo, qr, fecha);
                    listaUsuarios.add(nuevo);

                    System.out.println("Usuario '" + nombre + "' creado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese nombre del usuario a consultar: ");
                    String consulta = teclado.nextLine().trim();
                    if (consulta.isEmpty() || !consulta.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                        System.out.println("Nombre inválido.");
                        break;
                    }
                    boolean encontrado = false;
                    for (Usuario u : listaUsuarios) {
                        if (u.getNombre().equalsIgnoreCase(consulta)) {
                            System.out.println("ID: " + u.getId());
                            System.out.println("Nombre: " + u.getNombre());
                            System.out.println("Tipo: " + u.getTipo());
                            System.out.println("QR: " + u.getQrAscii());
                            System.out.println("Fecha de registro: " + u.getFechaRegistro());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese nombre del usuario a editar: ");
                    String editar = teclado.nextLine().trim();
                    if (editar.isEmpty() || !editar.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                        System.out.println("Nombre inválido.");
                        break;
                    }
                    Usuario usuarioEditar = null;
                    for (Usuario u : listaUsuarios) {
                        if (u.getNombre().equalsIgnoreCase(editar)) {
                            usuarioEditar = u;
                            break;
                        }
                    }
                    if (usuarioEditar != null) {
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = teclado.nextLine().trim();
                        if (!nuevoNombre.isEmpty() && nuevoNombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                            usuarioEditar.setNombre(nuevoNombre);
                            System.out.println("Usuario actualizado correctamente.");
                        } else {
                            System.out.println("Nuevo nombre inválido. Solo letras y espacios son permitidos.");
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese nombre del usuario a eliminar: ");
                    String eliminar = teclado.nextLine().trim();
                    if (eliminar.isEmpty() || !eliminar.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                        System.out.println("Nombre inválido.");
                        break;
                    }
                    Usuario usuarioEliminar = null;
                    for (Usuario u : listaUsuarios) {
                        if (u.getNombre().equalsIgnoreCase(eliminar)) {
                            usuarioEliminar = u;
                            break;
                        }
                    }
                    if (usuarioEliminar != null) {
                        listaUsuarios.remove(usuarioEliminar);
                        System.out.println("Usuario '" + eliminar + "' eliminado.");
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
