package ec.uce.edu.Dominio;

public class Estudiante  {
    private String matricula;
    private String facultad;

    public Estudiante() {
        matricula = "";
        facultad = "";
    }

    public Estudiante(String matricula, String facultad) {
        this.matricula = matricula;
        this.facultad = facultad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //metodos
    public boolean verificarMatricula() {
        return true;
    }
}
