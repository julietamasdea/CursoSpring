package DependencyInjectionFields;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoBeanLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Empleado leo = contexto.getBean("empleado", Empleado.class);

        contexto.close();
    }
}
