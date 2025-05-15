package ec.uce.edu.Dominio;

// ZonaEstacionamiento.java
public class ZonaEstacionamiento {
    private int capacidadTotal;
    private int espaciosDisponibles;
    private int idZona;
    private String facultad;

    public ZonaEstacionamiento() {
        capacidadTotal = 0;
        espaciosDisponibles = 0;
        idZona = 0;
        facultad = "";
    }

    public ZonaEstacionamiento(int capacidadTotal, int espaciosDisponibles, int idZona, String facultad) {
        this.capacidadTotal = capacidadTotal;
        this.espaciosDisponibles = espaciosDisponibles;
        this.idZona = idZona;
        this.facultad = facultad;
    }


    //Get y set
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //Metodos
    public void asignarEspacio() {
    }

    public void liberarEspacio() {
    }
}
