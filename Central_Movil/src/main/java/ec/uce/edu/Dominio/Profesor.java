package ec.uce.edu.Dominio;

public class Profesor {
    private String facultad;
    private boolean esVip;

    public Profesor() {
        facultad = "Ingenieria y Ciencias Aplicadas";
        esVip = true;
    }

    public Profesor(String facultad, boolean esVip) {
        if(facultad != null && !facultad.isEmpty()) {
            this.facultad = facultad;
        } else {
            this.facultad = "Ingenieria y Ciencias Aplicadas";  // Valor por defecto si no se pasa uno válido.
        }
        this.esVip = esVip;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        if (facultad != null && !facultad.isEmpty()) {
            this.facultad = facultad;
        }
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }
}
