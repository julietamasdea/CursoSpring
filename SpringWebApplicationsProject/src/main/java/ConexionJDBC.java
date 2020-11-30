import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionJDBC {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:mysql://localhost:3306/proyectohibernate?useSSL=false";
        String usuario="root";
        String password="julietamasdea";
        try {
            System.out.println("Intentando conectar con la BBDD: " + jdbcUrl);
            Connection miconexion = DriverManager.getConnection(jdbcUrl,usuario,password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
