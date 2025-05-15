package ec.uce.edu.Dominio;

public class EspacioPreferencial  {
    private String tipoPreferencia;
    private String prioridadAcceso;

    public EspacioPreferencial() {
        tipoPreferencia = "";
        prioridadAcceso = "";
    }

    public EspacioPreferencial(String tipoPreferencia, String prioridadAcceso) {
        this.tipoPreferencia = tipoPreferencia;
        this.prioridadAcceso = prioridadAcceso;
    }

    public String getTipoPreferencia() {
        return tipoPreferencia;
    }

    public void setTipoPreferencia(String tipoPreferencia) {
        this.tipoPreferencia = tipoPreferencia;
    }

    public String getPrioridadAcceso() {
        return prioridadAcceso;
    }

    public void setPrioridadAcceso(String prioridadAcceso) {
        this.prioridadAcceso = prioridadAcceso;
    }

    //metodos
    public boolean esUsuarioPrioritario(Usuario usuario) {
        return false;
    }
}
