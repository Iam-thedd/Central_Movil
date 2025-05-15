package ec.uce.edu.Dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        // Inicializa un usuario antes de cada prueba
        usuario = new Usuario("1", "Juan Perez", "Administrador", "QR1234", "2025-05-12");
    }

    @Test
    public void testGetId() {
        assertEquals("1", usuario.getId(), "El ID debe ser 1");
    }

    @Test
    public void testSetId() {
        usuario.setId("2");
        assertEquals("2", usuario.getId(), "El ID debe cambiar a 2");
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan Perez", usuario.getNombre(), "El nombre debe ser Juan Perez");
    }

    @Test
    public void testSetNombre() {
        usuario.setNombre("Ana Gómez");
        assertEquals("LUIS", usuario.getNombre(), "El nombre debe cambiar a Ana Gómez");
    }

    @Test
    public void testGetTipo() {
        assertEquals("Administrador", usuario.getTipo(), "El tipo debe ser Administrador");
    }

    @Test
    public void testSetTipo() {
        usuario.setTipo("Usuario");
        assertEquals("Usuario", usuario.getTipo(), "El tipo debe cambiar a Usuario");
    }

    @Test
    public void testGetQrAscii() {
        assertEquals("QR1234", usuario.getQrAscii(), "El código QR debe ser QR1234");
    }

    @Test
    public void testSetQrAscii() {
        usuario.setQrAscii("QR5678");
        assertEquals("QR5678", usuario.getQrAscii(), "El código QR debe cambiar a QR5678");
    }

    @Test
    public void testGetFechaRegistro() {
        assertEquals("2025-05-12", usuario.getFechaRegistro(), "La fecha de registro debe ser 2025-05-12");
    }

    @Test
    public void testSetFechaRegistro() {
        usuario.setFechaRegistro("2025-06-01");
        assertEquals("2025-06-01", usuario.getFechaRegistro(), "La fecha de registro debe cambiar a 2025-06-01");
    }

    @Test
    public void testValidarAcceso() {
        assertTrue(usuario.validarAcceso(), "El acceso debe ser válido");
    }
}
