import ec.uce.edu.Dominio.ValidadorEntradas;
public class TestValidadorEntradas {
    public static void main(String[] args) {
        System.out.println("=== Prueba de Validación de Entradas ===");

        // Validar número entero
        int edad = ValidadorEntradas.validarEntero("Ingrese su edad: ");
        System.out.println("Edad válida ingresada: " + edad);

        // Validar número decimal
        double precio = ValidadorEntradas.validarDecimal("Ingrese el precio: ");
        System.out.println("Precio válido ingresado: " + precio);

        // Validar carácter
        char inicial = ValidadorEntradas.validarCaracter("Ingrese su inicial: ");
        System.out.println("Inicial válida ingresada: " + inicial);

        // Validar email
        String email = ValidadorEntradas.validarEmail("Ingrese su email: ");
        System.out.println("Email válido ingresado: " + email);

        // Validar contraseña
        String password = ValidadorEntradas.validarPassword("Ingrese su contraseña: ");
        System.out.println("Contraseña válida ingresada");

        // Validar fecha
        String fecha = ValidadorEntradas.validarFecha("Ingrese fecha (dd/mm/aaaa): ");
        System.out.println("Fecha válida ingresada: " + fecha);

        System.out.println("=== Todas las validaciones fueron exitosas ===");
    }
}

