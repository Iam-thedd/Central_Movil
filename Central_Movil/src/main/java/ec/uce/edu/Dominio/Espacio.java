package ec.uce.edu.Dominio;

public class Espacio {
    private String id;
    private String zonaEstacionamiento;
    private String tipo;
    private String estado;
    private String fechaOcupado;

    public Espacio() {
        id = "10;";
        zonaEstacionamiento = "";
        tipo = "";
        estado = "";
        fechaOcupado = "";
    }

    public Espacio(String id, String zonaEstacionamiento, String tipo, String estado, String fechaOcupado) {
        this.id = id;
        this.zonaEstacionamiento = zonaEstacionamiento;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaOcupado = fechaOcupado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZonaEstacionamiento() {
        return zonaEstacionamiento;
    }

    public void setZonaEstacionamiento(String zonaEstacionamiento) {
        this.zonaEstacionamiento = zonaEstacionamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaOcupado() {
        return fechaOcupado;
    }

    public void setFechaOcupado(String fechaOcupado) {
        this.fechaOcupado = fechaOcupado;
    }

    //Metodos
    public void reservar() {

    }

    public boolean marcarComoReservado() {
        return true;
    }

    public boolean cancelarReserva() {
        return false;
    }
}
