package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {
        //leer xml de configuracion
        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //leer el class de configuracion
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        IEmpleados empleado = contexto.getBean("empleadoRRHH", IEmpleados.class);
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInformes());

        //cerrar contexto
        contexto.close();
    }
}
