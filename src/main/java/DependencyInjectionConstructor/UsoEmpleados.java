package DependencyInjectionConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {
        //creacion objeto empleado
        //Empleado empleadoUno = new SecretarioEmpleado();
        //uso de objetos creados
        //System.out.println(empleadoUno.getTareas());


        /*
        1) cargar archivo xml
        2) pedir el bean
        3) usar el bean
        4) cerrar el xml
         */
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleado Juan = contexto.getBean("empleado", Empleado.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        contexto.close();
    }
}
