package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotation")
@PropertySource("classpath:DatosEmpresas.properties")
public class EmpleadosConfig {
    //definir el bean para informeFinanciero
    @Bean
    public IInforme informe() { //el nombre del metodo sera el id del bean inyectado
        return new InformeRRHH();
    }

    //definir el bean para empleadoRRHH e inyectar dependencias
    @Bean
    public IEmpleados empleadoRRHH() {
        return new EmpleadoRRHH(informe());
    }
}
