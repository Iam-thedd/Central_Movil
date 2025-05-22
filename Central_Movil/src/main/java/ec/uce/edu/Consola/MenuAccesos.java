package ec.uce.edu.Consola;

import ec.uce.edu.Dominio.Acceso;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAccesos {

    private static ArrayList<Acceso> listaAccesos = new ArrayList<>();

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("         GESTIONAR ACCESO");
            System.out.println("====================================");
            System.out.println("1. Crear acceso");
            System.out.println("2. Consultar accesos");
            System.out.println("3. Editar acceso");
            System.out.println("4. Eliminar acceso");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            System.out.println();

            switch (opcion) {
                case 1: // Crear acceso y validar
                    System.out.print("Ingrese hora de entrada (HH:mm): ");
                    String horaEntrada = teclado.nextLine();

                    // Validar formato de hora de entrada
                    if (!validarHora(horaEntrada)) {
                        System.out.println("❌ Formato de hora de entrada inválido. El horario debe estar entre 07:00 y 22:00.");
                        break;
                    }

                    System.out.print("Ingrese hora de salida (HH:mm): ");
                    String horaSalida = teclado.nextLine();

                    // Validar formato de hora de salida
                    if (!validarHora(horaSalida)) {
                        System.out.println("❌ Formato de hora de salida inválido. El horario debe estar entre 07:00 y 22:00.");
                        break;
                    }

                    // Validar que la hora de salida no sea menor a la hora de entrada
                    if (!horaSalidaValida(horaEntrada, horaSalida)) {
                        System.out.println("❌ La hora de salida no puede ser menor a la hora de entrada.");
                        break;
                    }

                    boolean accesoPermitido = validarAcceso(horaEntrada);
                    Acceso nuevoAcceso = new Acceso(horaEntrada, horaSalida);
                    listaAccesos.add(nuevoAcceso);

                    if (accesoPermitido) {
                        System.out.println("✅ Acceso PERMITIDO.");
                    } else {
                        System.out.println("❌ Acceso DENEGADO (fuera del horario permitido).");
                    }
                    break;

                case 2: // Consultar accesos
                    if (listaAccesos.isEmpty()) {
                        System.out.println("No hay accesos registrados.");
                    } else {
                        System.out.println("Listado de accesos:");
                        int i = 1;
                        for (Acceso acceso : listaAccesos) {
                            System.out.println(i + ". Entrada: " + acceso.getHoraEntrada()
                                    + " | Salida: " + acceso.getHoraSalida());
                            i++;
                        }
                    }
                    break;

                case 3: // Editar acceso
                    System.out.print("Ingrese el número del acceso a editar: ");
                    int numEditar = teclado.nextInt();
                    teclado.nextLine();

                    if (numEditar >= 1 && numEditar <= listaAccesos.size()) {
                        Acceso accesoEditar = listaAccesos.get(numEditar - 1);

                        System.out.print("Nueva hora de entrada (HH:mm): ");
                        String nuevaEntrada = teclado.nextLine();

                        // Validar nueva hora de entrada
                        if (!validarHora(nuevaEntrada)) {
                            System.out.println("❌ Formato de hora de entrada inválido. El horario debe estar entre 07:00 y 22:00.");
                            break;
                        }

                        System.out.print("Nueva hora de salida (HH:mm): ");
                        String nuevaSalida = teclado.nextLine();

                        // Validar nueva hora de salida
                        if (!validarHora(nuevaSalida)) {
                            System.out.println("❌ Formato de hora de salida inválido. El horario debe estar entre 07:00 y 22:00.");
                            break;
                        }

                        // Validar que la hora de salida no sea menor a la hora de entrada
                        if (!horaSalidaValida(nuevaEntrada, nuevaSalida)) {
                            System.out.println("❌ La hora de salida no puede ser menor a la hora de entrada.");
                            break;
                        }

                        accesoEditar.setHoraEntrada(nuevaEntrada);
                        accesoEditar.setHoraSalida(nuevaSalida);

                        System.out.println("Acceso actualizado.");
                    } else {
                        System.out.println("Número de acceso inválido.");
                    }
                    break;

                case 4: // Eliminar acceso
                    System.out.print("Ingrese el número del acceso a eliminar: ");
                    int numEliminar = teclado.nextInt();

                    if (numEliminar >= 1 && numEliminar <= listaAccesos.size()) {
                        // Confirmación de eliminación
                        System.out.print("¿Está seguro de eliminar este acceso? (s/n): ");
                        String respuesta = teclado.next();
                        if (respuesta.equalsIgnoreCase("s")) {
                            listaAccesos.remove(numEliminar - 1);
                            System.out.println("Acceso eliminado correctamente.");
                        } else {
                            System.out.println("Eliminación cancelada.");
                        }
                    } else {
                        System.out.println("Número de acceso inválido.");
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

    // Validar si la hora está dentro del horario permitido (07:00 a 22:00)
    private static boolean validarAcceso(String hora) {
        // Horario permitido: 07:00 a 22:00
        try {
            String[] partes = hora.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            if (horas < 7 || horas > 22 || (horas == 22 && minutos > 0)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            System.out.println("Formato de hora inválido.");
            return false;
        }
    }

    // Validar si el formato de la hora es correcto
    private static boolean validarHora(String hora) {
        try {
            String[] partes = hora.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            // Validar que la hora esté en formato 24 horas
            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Validar que la hora de salida no sea menor a la hora de entrada
    private static boolean horaSalidaValida(String horaEntrada, String horaSalida) {
        String[] entradaParts = horaEntrada.split(":");
        String[] salidaParts = horaSalida.split(":");

        int horaEntradaInt = Integer.parseInt(entradaParts[0]);
        int minutoEntradaInt = Integer.parseInt(entradaParts[1]);

        int horaSalidaInt = Integer.parseInt(salidaParts[0]);
        int minutoSalidaInt = Integer.parseInt(salidaParts[1]);

        if (horaSalidaInt < horaEntradaInt || (horaSalidaInt == horaEntradaInt && minutoSalidaInt < minutoEntradaInt)) {
            return false;
        }

        return true;
    }
}
