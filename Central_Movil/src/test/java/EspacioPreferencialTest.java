

import ec.uce.edu.Dominio.EspacioPreferencial;
import ec.uce.edu.Dominio.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspacioPreferencialTest {

    @Test
    public void testConstructorPorDefecto() {
        EspacioPreferencial espacio = new EspacioPreferencial();
        assertEquals("", espacio.getTipoPreferencia());
        assertEquals("", espacio.getPrioridadAcceso());
    }

    @Test
    public void testConstructorConParametros() {
        EspacioPreferencial espacio = new EspacioPreferencial("Discapacidad", "Alta");
        assertEquals("Discapacidad", espacio.getTipoPreferencia());
        assertEquals("Alta", espacio.getPrioridadAcceso());
    }

    @Test
    public void testSettersYGetters() {
        EspacioPreferencial espacio = new EspacioPreferencial();
        espacio.setTipoPreferencia("Embarazada");
        espacio.setPrioridadAcceso("Media");

        assertEquals("Embarazada", espacio.getTipoPreferencia());
        assertEquals("Media", espacio.getPrioridadAcceso());
    }

    @Test
    public void testEsUsuarioPrioritarioSiempreFalso() {
        EspacioPreferencial espacio = new EspacioPreferencial("Discapacidad", "Alta");
        Usuario usuario = new Usuario(); // Asumiendo que tienes una clase Usuario
        assertFalse(espacio.esUsuarioPrioritario(usuario)); // Devuelve false porque no está implementado aún
    }
}

