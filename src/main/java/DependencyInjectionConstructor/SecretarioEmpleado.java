package DependencyInjectionConstructor;

public class SecretarioEmpleado implements Empleado {
    @Override
    public String getTareas() {
        return "secretaria";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
