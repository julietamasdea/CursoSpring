package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("ComercialExperimentado") //spring gracias a esta notacion crea el bean
//no necesariamente hay que darle un id al componente, si no lo quiero hacer directamente en el
//usoannotations pongo "comercialExperimentado" que es el nombre de la clase con la primera letra minuscula
public class ComercialExperimentado implements IEmpleados{
    @Autowired
    @Qualifier("informeFinanciero")
    private IInforme informe;
/*
    @Autowired //esto hace que spring busque en todo el proyecto si hay alguna clase que implemente la interfaz Informe
    public ComercialExperimentado(IInforme informe) {
        this.informe = informe;
    }
 */


    @Override
    public String getTareas() {
        return "Tareas de un comercial experimentado";
    }

    @Override
    public String getInformes() {
        return informe.getInformeFinanciero();
    }

    //ejecucion de codigo despues de creacion de bean
    @PostConstruct
    public void ejecutarInicio() {
        System.out.println("inicio");
    }

    //ejecucion de codigo despues de terminar contenedor Spring
    @PreDestroy
    public void ejecutarDestroy() {
        System.out.println("destroy");
    }
}
