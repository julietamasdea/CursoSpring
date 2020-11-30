package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientePrueba {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            Cliente cliente = new Cliente("micaela", "masdea", "la plata");
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
            System.out.println("Registro insertado");

            //lectura de registro
            session.beginTransaction();
            Cliente clienteInsertado = session.get(Cliente.class, cliente.getId());
            System.out.println(clienteInsertado);
            session.getTransaction().commit();
            System.out.println("Terminado");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
