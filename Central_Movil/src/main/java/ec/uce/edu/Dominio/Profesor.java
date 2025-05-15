package ec.uce.edu.Dominio;

public class Profesor {
    //Declaracion de variables//
    String facultad;
    boolean esVip;

    //Metodo constructor por defecto//
    public Profesor (){
        facultad = "Ingenieria y Ciencias Aplicadas";
        esVip = true;
    }

    //Metodo constructor con parámetros//
    public Profesor (String facultad, boolean esVip){
        this.facultad = facultad;
        this.esVip = esVip;
    }

    //Metodo obtenerFacultad//
    public String obtenerFacultad (){
        return facultad;
    }

    //Metodos get y set//
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }
}
