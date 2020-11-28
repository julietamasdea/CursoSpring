package DependencyInjectionConstructor;

public class JefeEmpleado implements Empleado {
    //Creacion de campo tipo creacion informe (interfaz)
    private CreacionInformes informe;
    //creacion de constructor que inyecta la dependencia
    public JefeEmpleado(CreacionInformes informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Gestiono las cuestiones relativas a mis empleados de seccion";
    }

    @Override
    public String getInforme() {
        return "informe creado por el jefe empleado" + informe.getInforme();
    }
}
