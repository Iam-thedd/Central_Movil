package ec.uce.edu.Dominio;

public class SistemaArchivos {
    private String rutaAutorizados;
    private String nombre;
    private String rutaRegistros;

    public SistemaArchivos() {
        rutaAutorizados = "";
        nombre = "";
        rutaRegistros = "";
    }

    public SistemaArchivos(String rutaAutorizados, String nombre, String rutaRegistros) {
        this.rutaAutorizados = rutaAutorizados;
        this.nombre = nombre;
        this.rutaRegistros = rutaRegistros;
    }

    public String getRutaAutorizados() {
        return rutaAutorizados;
    }

    public void setRutaAutorizados(String rutaAutorizados) {
        this.rutaAutorizados = rutaAutorizados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaRegistros() {
        return rutaRegistros;
    }

    public void setRutaRegistros(String rutaRegistros) {
        this.rutaRegistros = rutaRegistros;
    }


    //metodos
    public String leerCsvArchivo(String archivo) {

        return "datos del archivo CSV";
    }

    public void escribirCsvDatos(String datos) {

    }

    public void escribirLogRegistro(String log) {

    }
}
