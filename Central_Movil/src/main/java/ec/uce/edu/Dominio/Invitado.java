import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invitado {
    private String fechaExpiracion;
    private String motivoVisita;

    public Invitado() {
        fechaExpiracion = "";
        motivoVisita = "";
    }

    public Invitado(String fechaExpiracion, String motivoVisita) {
        this.fechaExpiracion = fechaExpiracion;
        this.motivoVisita = motivoVisita;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    // Validar si la fecha de expiración es posterior a la fecha actual
    public boolean validarVigencia() {
        // Usar DateTimeFormatter para parsear la fecha de expiración
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaExpiracionDate = LocalDate.parse(fechaExpiracion, formatter);
        LocalDate fechaActual = LocalDate.now();

        // Validar si la fecha de expiración es posterior a la fecha actual
        return !fechaExpiracionDate.isBefore(fechaActual);
    }
}
