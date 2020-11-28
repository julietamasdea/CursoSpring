package annotations;

import org.springframework.beans.factory.annotation.Value;

public class EmpleadoRRHH implements IEmpleados {
    private IInforme informefinanciero;
    @Value("${email}")
    private String email;

    @Value("${nombreEmpresa}")
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
