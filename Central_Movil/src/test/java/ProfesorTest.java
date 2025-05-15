

import ec.uce.edu.Dominio.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    public void testConstructorPorDefecto() {
        Profesor profesor = new Profesor();
        assertEquals("Ingenieria y Ciencias Aplicadas", profesor.getFacultad());
        assertTrue(profesor.isEsVip());
    }

    @Test
    public void testConstructorConParametros() {
        Profesor profesor = new Profesor("Ciencias Económicas", false);
        assertEquals("Ciencias Económicas", profesor.getFacultad());
        assertFalse(profesor.isEsVip());
    }

    @Test
    public void testSettersYGetters() {
        Profesor profesor = new Profesor();
        profesor.setFacultad("Arquitectura");
        profesor.setEsVip(false);

        assertEquals("Arquitectura", profesor.getFacultad());
        assertFalse(profesor.isEsVip());
    }

    @Test
    public void testObtenerFacultad() {
        Profesor profesor = new Profesor("Derecho", true);
        assertEquals("Derecho", profesor.obtenerFacultad());
    }
}
