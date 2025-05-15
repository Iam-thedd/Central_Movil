

import ec.uce.edu.Dominio.Estudiante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testConstructorPorDefecto() {
        Estudiante estudiante = new Estudiante();
        assertEquals("", estudiante.getMatricula());
        assertEquals("", estudiante.getFacultad());
    }

    @Test
    public void testConstructorConParametros() {
        Estudiante estudiante = new Estudiante("2023-12345", "Ingeniería");
        assertEquals("2023-12345", estudiante.getMatricula());
        assertEquals("Ingeniería", estudiante.getFacultad());
    }

    @Test
    public void testSettersYGetters() {
        Estudiante estudiante = new Estudiante();
        estudiante.setMatricula("2024-98765");
        estudiante.setFacultad("Arquitectura");

        assertEquals("2024-98765", estudiante.getMatricula());
        assertEquals("Arquitectura", estudiante.getFacultad());
    }

    @Test
    public void testVerificarMatricula() {
        Estudiante estudiante = new Estudiante();
        assertTrue(estudiante.verificarMatricula());
    }
}
