package annotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado") //spring gracias a esta notacion crea el bean
public class ComercialExperimentado implements IEmpleados{
    @Override
    public String getTareas() {
        return "Tareas de un comercial experimentado";
    }

    @Override
    public String getInformes() {
        return "Informe de comercial experimentado";
    }
}
