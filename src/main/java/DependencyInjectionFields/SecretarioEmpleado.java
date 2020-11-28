package DependencyInjectionFields;

public class SecretarioEmpleado implements Empleado {
    private CreacionInformes informe;

    public void setInforme(CreacionInformes informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "secretario";
    }

    @Override
    public String getInforme() {
        return ("Informe generado por secretario " + informe.getInforme());
    }

}
