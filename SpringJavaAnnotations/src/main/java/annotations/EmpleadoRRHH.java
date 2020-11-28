package annotations;

public class EmpleadoRRHH implements IEmpleados {
    private IInforme informefinanciero;

    public EmpleadoRRHH(IInforme informefinanciero) {
        this.informefinanciero = informefinanciero;
    }

    @Override
    public String getTareas() {
        return "Gestion y direccion de rrhh";
    }

    @Override
    public String getInformes() {
        return "Informe de RRHH: " + informefinanciero.getInformeFinanciero();
    }
}
