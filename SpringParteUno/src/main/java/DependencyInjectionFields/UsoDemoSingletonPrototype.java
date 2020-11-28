package DependencyInjectionFields;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Empleado leo = contexto.getBean("secretarioEmpleado", Empleado.class);
        Empleado juan = contexto.getBean("secretarioEmpleado", Empleado.class);

        System.out.println(leo);
        System.out.println(juan);
        //Si usa o no prototype, se determina en el applicationcontext con "scope='prototype'" si no se pone nada
        //asume que es singleton
        if(leo==juan) System.out.println("apuntan al mismo objeto");
        else System.out.println("no es el mismo objeto");

        contexto.close();
    }
}
