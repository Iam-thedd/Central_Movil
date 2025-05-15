package ec.uce.edu.Dominio;

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

    //metodos
    public boolean validarVigencia() {
        return true;
    }
}
