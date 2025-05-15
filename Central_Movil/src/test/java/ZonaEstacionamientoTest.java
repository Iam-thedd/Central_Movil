import ec.uce.edu.Dominio.ZonaEstacionamiento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZonaEstacionamientoTest {

    private ZonaEstacionamiento zonaEstacionamiento;

    @BeforeEach
    public void setUp() {
        // Inicializa un objeto ZonaEstacionamiento antes de cada prueba
        zonaEstacionamiento = new ZonaEstacionamiento(100, 50, 1, "Facultad de Ingenieria");
    }

    @Test
    public void testGetCapacidadTotal() {
        assertEquals(100, zonaEstacionamiento.getCapacidadTotal(), "La capacidad total debe ser 100");
    }

    @Test
    public void testSetCapacidadTotal() {
        zonaEstacionamiento.setCapacidadTotal(120);
        assertEquals(120, zonaEstacionamiento.getCapacidadTotal(), "La capacidad total debe cambiar a 120");
    }

    @Test
    public void testGetEspaciosDisponibles() {
        assertEquals(50, zonaEstacionamiento.getEspaciosDisponibles(), "Los espacios disponibles deben ser 50");
    }

    @Test
    public void testSetEspaciosDisponibles() {
        zonaEstacionamiento.setEspaciosDisponibles(60);
        assertEquals(60, zonaEstacionamiento.getEspaciosDisponibles(), "Los espacios disponibles deben cambiar a 60");
    }

    @Test
    public void testGetIdZona() {
        assertEquals(1, zonaEstacionamiento.getIdZona(), "El ID de la zona debe ser 1");
    }

    @Test
    public void testSetIdZona() {
        zonaEstacionamiento.setIdZona(2);
        assertEquals(2, zonaEstacionamiento.getIdZona(), "El ID de la zona debe cambiar a 2");
    }

    @Test
    public void testGetFacultad() {
        assertEquals("Facultad de Ingenieria", zonaEstacionamiento.getFacultad(), "La facultad debe ser 'Facultad de Ingenieria'");
    }

    @Test
    public void testSetFacultad() {
        zonaEstacionamiento.setFacultad("Facultad de Medicina");
        assertEquals("Facultad de Medicina", zonaEstacionamiento.getFacultad(), "La facultad debe cambiar a 'Facultad de Medicina'");
    }

    @Test
    public void testAsignarEspacio() {
        zonaEstacionamiento.asignarEspacio();
        // En este caso, asumir que asignar un espacio reduce los espacios disponibles
        // Aquí podrías añadir la lógica para que el test sea más específico si implementas lógica en asignarEspacio()
        assertTrue(zonaEstacionamiento.getEspaciosDisponibles() < 50, "Los espacios disponibles deben ser menores a 50 después de asignar uno");
    }

    @Test
    public void testLiberarEspacio() {
        zonaEstacionamiento.liberarEspacio();
        // Similar a asignarEspacio, si liberamos un espacio, los espacios disponibles deberían aumentar
        assertTrue(zonaEstacionamiento.getEspaciosDisponibles() > 50, "Los espacios disponibles deben ser mayores a 50 después de liberar uno");
    }
}
