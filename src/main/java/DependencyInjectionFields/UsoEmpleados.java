package DependencyInjectionFields;

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
        JefeEmpleado Juan = contexto.getBean("empleado", JefeEmpleado.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        System.out.println(Juan.getEmail());
        System.out.println(Juan.getNombreEmpresa());

        Empleado Leo = contexto.getBean("secretarioEmpleado", Empleado.class);
        System.out.println(Leo.getTareas());
        System.out.println(Leo.getInforme());

        contexto.close();
    }
}
