package DependencyInjectionSetter;

public class JefeEmpleado implements Empleado {

    private CreacionInformes informe;

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
