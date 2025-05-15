

import ec.uce.edu.Dominio.EspacioPremium;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspacioPremiunTest {

    @Test
    public void testConstructorPorDefecto() {
        EspacioPremium espacio = new EspacioPremium();
        assertEquals("", espacio.getTarifa());
        assertEquals("", espacio.getIdEspacioReservado());
        assertEquals("", espacio.getFechaReserva());
    }

    @Test
    public void testConstructorConParametros() {
        EspacioPremium espacio = new EspacioPremium("5.00", "ESP123", "2024-05-01");
        assertEquals("5.00", espacio.getTarifa());
        assertEquals("ESP123", espacio.getIdEspacioReservado());
        assertEquals("2024-05-01", espacio.getFechaReserva());
    }

    @Test
    public void testSettersYGetters() {
        EspacioPremium espacio = new EspacioPremium();
        espacio.setTarifa("10.00");
        espacio.setIdEspacioReservado("ESP456");
        espacio.setFechaReserva("2024-05-12");

        assertEquals("10.00", espacio.getTarifa());
        assertEquals("ESP456", espacio.getIdEspacioReservado());
        assertEquals("2024-05-12", espacio.getFechaReserva());
    }

    @Test
    public void testMetodoAumentarTiempoReserva() {
        EspacioPremium espacio = new EspacioPremium();
        assertDoesNotThrow(() -> espacio.aumentarTiempoReserva());
    }
}
