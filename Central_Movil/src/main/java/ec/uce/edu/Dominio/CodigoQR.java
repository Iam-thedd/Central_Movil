package ec.uce.edu.Dominio;

import java.util.Date;

public class CodigoQR {
    private String codigoLeido;
    private Date fechaEscaneo;

    // Constructor por defecto
    public CodigoQR() {
        codigoLeido = "SIN_CODIGO";
        fechaEscaneo = new Date();
    }

    // Constructor con parámetros
    public CodigoQR(String codigoLeido, Date fechaEscaneo) {
        this.codigoLeido = codigoLeido;
        this.fechaEscaneo = fechaEscaneo;
    }

    // Getters y Setters
    public String getCodigoLeido() {
        return codigoLeido;
    }

    public void setCodigoLeido(String codigoLeido) {
        this.codigoLeido = codigoLeido;
    }

    public Date getFechaEscaneo() {
        return fechaEscaneo;
    }

    public void setFechaEscaneo(Date fechaEscaneo) {
        this.fechaEscaneo = fechaEscaneo;
    }

    // Métodos
    public String leerCodigo() {
        return null;
    }

    public String convertirAscii(String qr) {
        return null;
    }

    public boolean validarFormato(String codigo) {
        return false;
    }
}
