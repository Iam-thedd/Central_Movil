import ec.uce.edu.Dominio.Acceso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcessoTest {

    @Test
    public void testConstructorYGetters() {
        Acceso acceso = new Acceso("08:00", "10:00");
        assertEquals("08:00", acceso.getHoraEntrada());
        assertEquals("10:00", acceso.getHoraSalida());
    }

    @Test
    public void testSetters() {
        Acceso acceso = new Acceso();
        acceso.setHoraEntrada("09:00");
        acceso.setHoraSalida("11:00");
        assertEquals("09:00", acceso.getHoraEntrada());
        assertEquals("11:00", acceso.getHoraSalida());
    }

    @Test
    public void testObtenerEstado() {
        Acceso acceso = new Acceso();
        assertEquals("Estado del acceso", acceso.obtenerEstado());
    }
}

