package ec.uce.edu.Dominio;

public class EspacioPremium {
    private String tarifa;
    private String idEspacioReservado;
    private String fechaReserva;

    public EspacioPremium() {
        tarifa = "";
        idEspacioReservado = "";
        fechaReserva = "";
    }

    public EspacioPremium( String tarifa, String idEspacioReservado, String fechaReserva) {
        this.tarifa = tarifa;
        this.idEspacioReservado = idEspacioReservado;
        this.fechaReserva = fechaReserva;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getIdEspacioReservado() {
        return idEspacioReservado;
    }

    public void setIdEspacioReservado(String idEspacioReservado) {
        this.idEspacioReservado = idEspacioReservado;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    //metodos
    public void aumentarTiempoReserva() {
    }
}
