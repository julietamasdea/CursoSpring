package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClienteDelete {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            //idem que update
            session.createQuery("delete Cliente where nombre='maira'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
