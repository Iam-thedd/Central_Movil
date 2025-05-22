package ec.uce.edu.Dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EspacioPremium {
    private String tarifa;
    private String idEspacioReservado;
    private String fechaReserva;

    // Constructor por defecto
    public EspacioPremium() {
        tarifa = "";
        idEspacioReservado = "";
        fechaReserva = "";
    }

    // Constructor parametrizado
    public EspacioPremium(String tarifa, String idEspacioReservado, String fechaReserva) {
        this.tarifa = tarifa;
        this.idEspacioReservado = idEspacioReservado;
        this.fechaReserva = fechaReserva;
    }

    // Métodos Get y Set
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

    // Método para aumentar el tiempo de reserva en días
    public void aumentarTiempoReserva(int dias) {
        // Parsear la fecha actual (en formato String) a LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(this.fechaReserva, formatter);

        // Sumar los días
        LocalDate nuevaFecha = fecha.plusDays(dias);

        // Actualizar la fecha de reserva
        this.fechaReserva = nuevaFecha.format(formatter);
    }
}
