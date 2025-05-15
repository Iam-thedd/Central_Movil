package ec.uce.edu.Dominio;

public class Universidad {
    private int zonasEstacionamiento;
    private String horarioApertura;
    private String horarioCierre;


    //Por defecto
    public Universidad() {
        zonasEstacionamiento = 3;
        horarioApertura = "7:00 am";
        horarioCierre = "18:00pm";

    }

    //Parametrps
    public Universidad(int zonasEstacionamiento, String horarioApertura, String horarioCierre) {
        this.zonasEstacionamiento = zonasEstacionamiento;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;

    }

    //Get y set
    public int getZonasEstacionamiento() {
        return zonasEstacionamiento;
    }

    public void setZonasEstacionamiento(int zonasEstacionamiento) {
        this.zonasEstacionamiento = zonasEstacionamiento;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    //Metodos
    public boolean verificarDisponibilidad (){
        return false;
    }

}
