package web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("v1")
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

    @RequestMapping("/procesaDatosFormularioAlumnos") //no necesariamente tiene que llamarse igual que el metodo
    //public String procesaDatosFormularioAlumnos(HttpServletRequest request, Model model) { //proporciona el formulario
    public String procesaDatosFormularioAlumnos(@RequestParam("nombreAlumno") String nombre, Model model) {
            //leer la informacion que viene del cuadro de texto
        //String nombre = request.getParameter("nombreAlumno");
        nombre += " es el mejor alumno";
        String mensajeFinal = "¿Quien es el mejor alumno? " + nombre;

        //agregando info al modelo
        model.addAttribute("mensajeFinal", mensajeFinal);
        return "formularioAlumnosProcesados";
    }
}
