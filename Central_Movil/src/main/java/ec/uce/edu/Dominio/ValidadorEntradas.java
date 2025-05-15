package ec.uce.edu.Dominio;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidadorEntradas {
    private static Scanner scanner = new Scanner(System.in);

    // Método para validar un número entero
    public static int validarEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para números enteros (positivos y negativos)
            Pattern patron = Pattern.compile("^-?\\d+$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return Integer.parseInt(entrada);
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
    }

    // Método para validar un número decimal
    public static double validarDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para números decimales (positivos y negativos)
            Pattern patron = Pattern.compile("^-?\\d+(\\.\\d+)?$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return Double.parseDouble(entrada);
            } else {
                System.out.println("Error: Debe ingresar un número decimal válido.");
            }
        }
    }

    // Método para validar un carácter alfabético
    public static char validarCaracter(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para un solo carácter alfabético (mayúscula o minúscula)
            Pattern patron = Pattern.compile("^[a-zA-Z]$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return entrada.charAt(0);
            } else {
                System.out.println("Error: Debe ingresar un único carácter alfabético.");
            }
        }
    }

    // Método para validar un correo electrónico
    public static String validarEmail(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para correo electrónico (simplificado)
            Pattern patron = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return entrada;
            } else {
                System.out.println("Error: Debe ingresar un correo electrónico válido.");
            }
        }
    }

    // Método para validar una contraseña segura
    public static String validarPassword(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para contraseña segura:
            // Al menos 8 caracteres, una mayúscula, una minúscula, un número y un caracter especial
            Pattern patron = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return entrada;
            } else {
                System.out.println("Error: La contraseña debe tener al menos 8 caracteres, " +
                        "incluyendo una mayúscula, una minúscula, un número y un carácter especial.");
            }
        }
    }

    // Método para validar una fecha en formato dd/mm/aaaa
    public static String validarFecha(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            // Patrón para fecha en formato dd/mm/aaaa
            Pattern patron = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
            Matcher comparador = patron.matcher(entrada);

            if (comparador.matches()) {
                return entrada;
            } else {
                System.out.println("Error: Debe ingresar una fecha válida en formato dd/mm/aaaa.");
            }
        }
    }
}

