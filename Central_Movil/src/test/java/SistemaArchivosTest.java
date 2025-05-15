
import ec.uce.edu.Dominio.SistemaArchivos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaArchivosTest {

    @Test
    public void testConstructorPorDefecto() {
        SistemaArchivos sistema = new SistemaArchivos();
        assertEquals("", sistema.getRutaAutorizados());
        assertEquals("", sistema.getNombre());
        assertEquals("", sistema.getRutaRegistros());
    }

    @Test
    public void testConstructorConParametros() {
        SistemaArchivos sistema = new SistemaArchivos("ruta/auto.csv", "Gestor", "ruta/log.txt");
        assertEquals("ruta/auto.csv", sistema.getRutaAutorizados());
        assertEquals("Gestor", sistema.getNombre());
        assertEquals("ruta/log.txt", sistema.getRutaRegistros());
    }

    @Test
    public void testSettersYGetters() {
        SistemaArchivos sistema = new SistemaArchivos();
        sistema.setRutaAutorizados("autorizados.csv");
        sistema.setNombre("ArchivoTest");
        sistema.setRutaRegistros("registro.log");

        assertEquals("autorizados.csv", sistema.getRutaAutorizados());
        assertEquals("ArchivoTest", sistema.getNombre());
        assertEquals("registro.log", sistema.getRutaRegistros());
    }

    @Test
    public void testLeerCsvArchivo() {
        SistemaArchivos sistema = new SistemaArchivos();
        String resultado = sistema.leerCsvArchivo("archivo.csv");
        assertEquals("datos del archivo CSV", resultado);
    }
}
