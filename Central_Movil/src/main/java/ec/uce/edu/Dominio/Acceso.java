package ec.uce.edu.Dominio;

public class Acceso {
    private String horaEntrada;
    private String horaSalida;

    public Acceso() {
        horaEntrada = "";
        horaSalida = "";

    }

    public Acceso(String horaEntrada, String horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    //metodos
    public void ocupar() {

    }

    public void liberar() {

    }

    public String obtenerEstado() {

        return "Estado del acceso";
    }
}
