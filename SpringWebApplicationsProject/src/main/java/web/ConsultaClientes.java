package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ConsultaClientes {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            System.out.println("Tabla entera de clientes");
            List<Cliente> clientes = session.createQuery("from Cliente").list();

            listarClientes(clientes);

            System.out.println("Tabla cliente nombr=julieta");
            List<Cliente> clientesJ = session.createQuery("from Cliente cli where cli.nombre='julieta'").list();

            listarClientes(clientesJ);

            System.out.println("Tabla clientes que vivan en la plata o nombre maira");
            List<Cliente> clientesDN = session.createQuery("from Cliente cli where cli.nombre='maira' or cli.direccion='la plata'").list();

            listarClientes(clientesDN);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    private static void listarClientes(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
