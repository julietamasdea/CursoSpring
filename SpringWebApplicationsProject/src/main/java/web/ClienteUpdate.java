package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ClienteUpdate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            /*
            Forma 1
                int clienteId = 1;
                Cliente cliente = session.get(Cliente.class,clienteId);
                cliente.setNombre("Valentina");
                System.out.println("Registro modificado correctamente");
             */
            //Forma 2
            session.createQuery("update Cliente set apellido='Masdea' where nombre like 'M%'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
