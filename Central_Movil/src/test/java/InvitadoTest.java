

import ec.uce.edu.Dominio.Invitado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvitadoTest {

    @Test
    public void testConstructorPorDefecto() {
        Invitado invitado = new Invitado();
        assertEquals("", invitado.getFechaExpiracion());
        assertEquals("", invitado.getMotivoVisita());
    }

    @Test
    public void testConstructorConParametros() {
        Invitado invitado = new Invitado("2025-05-15", "Reunión académica");
        assertEquals("2025-05-15", invitado.getFechaExpiracion());
        assertEquals("Reunión académica", invitado.getMotivoVisita());
    }

    @Test
    public void testSettersYGetters() {
        Invitado invitado = new Invitado();
        invitado.setFechaExpiracion("2025-12-01");
        invitado.setMotivoVisita("Entrevista");

        assertEquals("2025-12-01", invitado.getFechaExpiracion());
        assertEquals("Entrevista", invitado.getMotivoVisita());
    }

    @Test
    public void testValidarVigencia() {
        Invitado invitado = new Invitado();
        assertTrue(invitado.validarVigencia());
    }
}
