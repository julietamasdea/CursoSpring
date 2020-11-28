package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado") //spring gracias a esta notacion crea el bean
//no necesariamente hay que darle un id al componente, si no lo quiero hacer directamente en el
//usoannotations pongo "comercialExperimentado" que es el nombre de la clase con la primera letra minuscula

public class ComercialExperimentado implements IEmpleados{
    private Informe informe;

    @Autowired //esto hace que spring busque en todo el proyecto si hay alguna clase que implemente la interfaz Informe
    public ComercialExperimentado(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas de un comercial experimentado";
    }

    @Override
    public String getInformes() {
        return informe.getInformeFinanciero();
    }

}
