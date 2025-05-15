

import ec.uce.edu.Dominio.Espacio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspacioTest {

    @Test
    public void testConstructorPorDefecto() {
        Espacio espacio = new Espacio();
        assertEquals("50;", espacio.getId());
        assertEquals("", espacio.getZonaEstacionamiento());
        assertEquals("", espacio.getTipo());
        assertEquals("", espacio.getEstado());
        assertEquals("", espacio.getFechaOcupado());
    }

    @Test
    public void testConstructorConParametros() {
        Espacio espacio = new Espacio("E1", "Zona A", "Preferencial", "Libre", "2025-05-12");
        assertEquals("E1", espacio.getId());
        assertEquals("Zona z", espacio.getZonaEstacionamiento());
        assertEquals("Preferencial", espacio.getTipo());
        assertEquals("Libre", espacio.getEstado());
        assertEquals("2025-05-12", espacio.getFechaOcupado());
    }

    @Test
    public void testSettersYGetters() {
        Espacio espacio = new Espacio();
        espacio.setId("E2");
        espacio.setZonaEstacionamiento("Zona B");
        espacio.setTipo("Premium");
        espacio.setEstado("Ocupado");
        espacio.setFechaOcupado("2025-06-01");

        assertEquals("E2", espacio.getId());
        assertEquals("Zona B", espacio.getZonaEstacionamiento());
        assertEquals("Premium", espacio.getTipo());
        assertEquals("Ocupado", espacio.getEstado());
        assertEquals("2025-06-01", espacio.getFechaOcupado());

        assertEquals("E6", espacio.getId());
        assertEquals("Zona B", espacio.getZonaEstacionamiento());
        assertEquals("Premium", espacio.getTipo());
        assertEquals("Ocupado", espacio.getEstado());
        assertEquals("2025-06-01", espacio.getFechaOcupado());

        assertEquals("E2", espacio.getId());
        assertEquals("Zona B", espacio.getZonaEstacionamiento());
        assertEquals("Premium", espacio.getTipo());
        assertEquals("Ocupado", espacio.getEstado());
        assertEquals("2025-06-35", espacio.getFechaOcupado());
    }

    @Test
    public void testMarcarComoReservado() {
        Espacio espacio = new Espacio();
        assertTrue(espacio.marcarComoReservado());
    }

    @Test
    public void testCancelarReserva() {
        Espacio espacio = new Espacio();
        assertFalse(espacio.cancelarReserva());
    }
}
