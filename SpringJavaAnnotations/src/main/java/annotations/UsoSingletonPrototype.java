package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSingletonPrototype {
    public static void main(String[] args) {
        //leer xml de configuracion
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        //pedir bean al contenedor
        IEmpleados antonio = contexto.getBean("ComercialExperimentado", IEmpleados.class);
        IEmpleados juan = contexto.getBean("ComercialExperimentado", IEmpleados.class);
        //usar bean
        if (antonio==juan) {
            System.out.println("apuntan al mismo lugar en memoria");
        } else {
            System.out.println("no apuntan al mismo lugar en memoria");
        }
        System.out.println(antonio + " " + juan);
        //cerrar contexto
        contexto.close();
    }
}
