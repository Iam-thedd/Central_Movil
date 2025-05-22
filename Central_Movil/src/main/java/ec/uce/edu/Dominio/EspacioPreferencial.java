package ec.uce.edu.Dominio;

public class EspacioPreferencial {
    private String tipoPreferencia;
    private String prioridadAcceso;

    // Constructor por defecto
    public EspacioPreferencial() {
        tipoPreferencia = "";
        prioridadAcceso = "";
    }

    // Constructor parametrizado
    public EspacioPreferencial(String tipoPreferencia, String prioridadAcceso) {
        this.tipoPreferencia = tipoPreferencia;
        this.prioridadAcceso = prioridadAcceso;
    }

    // Métodos Get y Set
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

    // Método para verificar si el usuario tiene acceso prioritario
    public boolean esUsuarioPrioritario(Usuario usuario) {
        // Verificar si el tipo de preferencia del espacio coincide con el tipo del usuario
        if (this.tipoPreferencia.equalsIgnoreCase(usuario.getTipo())) {
            // Verificar si la prioridad de acceso es suficiente
            if (this.prioridadAcceso.equalsIgnoreCase("alta")) {
                return true;
            } else if (this.prioridadAcceso.equalsIgnoreCase("media") && usuario.getTipo().equalsIgnoreCase("profesor")) {
                return true;
            } else if (this.prioridadAcceso.equalsIgnoreCase("baja") && usuario.getTipo().equalsIgnoreCase("estudiante")) {
                return true;
            }
        }
        return false;
    }
}

