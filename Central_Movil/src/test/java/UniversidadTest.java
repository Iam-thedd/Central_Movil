

import ec.uce.edu.Dominio.Universidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniversidadTest {

    @Test
    public void testConstructorPorDefecto() {
        Universidad uni = new Universidad();
        assertEquals(3, uni.getZonasEstacionamiento());
        assertEquals("7:00 am", uni.getHorarioApertura());
        assertEquals("18:00pm", uni.getHorarioCierre());
    }

    @Test
    public void testConstructorConParametros() {
        Universidad uni = new Universidad(5, "8:00 am", "20:00pm");
        assertEquals(5, uni.getZonasEstacionamiento());
        assertEquals("8:00 am", uni.getHorarioApertura());
        assertEquals("20:00pm", uni.getHorarioCierre());
    }

    @Test
    public void testSettersYGetters() {
        Universidad uni = new Universidad();
        uni.setZonasEstacionamiento(4);
        uni.setHorarioApertura("6:30 am");
        uni.setHorarioCierre("19:00pm");

        assertEquals(4, uni.getZonasEstacionamiento());
        assertEquals("6:30 am", uni.getHorarioApertura());
        assertEquals("19:00pm", uni.getHorarioCierre());
    }

    @Test
    public void testVerificarDisponibilidad() {
        Universidad uni = new Universidad();
        assertFalse(uni.verificarDisponibilidad()); // ya que devuelve false por defecto
    }
}
