package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnoController {

    @RequestMapping("/muestraFormularioAlumnos") //no necesariamente tiene que llamarse igual que el metodo
    public String muestraFormularioAlumnos() { //proporciona el formulario
        return "formularioAlumnos";
    }

    //metodo para procesar la info que viaja en el formulario
    @RequestMapping("/procesaFormularioAlumnos") //no necesariamente tiene que llamarse igual que el metodo
    public String procesaFormularioAlumnos() { //proporciona el formulario
        return "formularioAlumnosProcesados";
    }
}
