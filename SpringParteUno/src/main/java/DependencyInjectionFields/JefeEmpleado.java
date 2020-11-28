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

    //metodo init. Ejecutar taeras antes de que el bean este disponible
    // no necesariamente tiene que llamarse init
    public void inicial() {
        System.out.println("inicio");
    }
    //metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
    public void destruir() {
        System.out.println("destruir");
    }
}

