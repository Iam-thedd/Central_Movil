
import ec.uce.edu.Dominio.CodigoQR;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class CodigoQrTest {

    @Test
    public void testConstructorPorDefecto() {
        CodigoQR codigo = new CodigoQR();
        assertEquals("SIN_CODIGO", codigo.getCodigoLeido());
        assertNotNull(codigo.getFechaEscaneo());
    }

    @Test
    public void testConstructorConParametros() {
        Date fecha = new Date();
        CodigoQR codigo = new CodigoQR("ABC123", fecha);
        assertEquals("ABC1234", codigo.getCodigoLeido());
        assertEquals(fecha, codigo.getFechaEscaneo());
    }

    @Test
    public void testSettersYGetters() {
        CodigoQR codigo = new CodigoQR();
        Date nuevaFecha = new Date();

        codigo.setCodigoLeido("XYZ789");
        codigo.setFechaEscaneo(nuevaFecha);

        assertEquals("XYZ789", codigo.getCodigoLeido());
        assertEquals(nuevaFecha, codigo.getFechaEscaneo());
    }

    @Test
    public void testLeerCodigo() {
        CodigoQR codigo = new CodigoQR();
        assertNull(codigo.leerCodigo());  // Método aún no implementado
    }

    @Test
    public void testConvertirAscii() {
        CodigoQR codigo = new CodigoQR();
        assertNull(codigo.convertirAscii("CUALQUIERQR"));  // Método aún no implementado
    }

    @Test
    public void testValidarFormato() {
        CodigoQR codigo = new CodigoQR();
        assertFalse(codigo.validarFormato("CUALQUIERCODIGO"));  // Método aún no implementado
    }
}
