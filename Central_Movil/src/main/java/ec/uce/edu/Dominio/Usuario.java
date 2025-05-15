package ec.uce.edu.Dominio;

public class Usuario {
    private String id;
    private String nombre;
    private String tipo;
    private String qrAscii;
    private String fechaRegistro;

    public Usuario() {
        id = "";
        nombre = "";
        tipo = "";
        qrAscii = "";
        fechaRegistro = "";

    }

    public Usuario(String id, String nombre, String tipo, String qrAscii, String fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.qrAscii = qrAscii;
        this.fechaRegistro = fechaRegistro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQrAscii() {
        return qrAscii;
    }

    public void setQrAscii(String qrAscii) {
        this.qrAscii = qrAscii;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    //metodos
    public boolean validarAcceso() {

        return true;
    }
}

