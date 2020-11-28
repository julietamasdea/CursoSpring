package DependencyInjectionFields;

public class JefeEmpleado implements Empleado {

    private CreacionInformes informe;
    private String email;
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setInforme(CreacionInformes informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Gestiono las cuestiones relativas a mis empleados de seccion";
    }

    @Override
    public String getInforme() {
        return "informe creado por el jefe empleado " + informe.getInforme();
    }
}
