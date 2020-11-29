package web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @RequestMapping("/verFomularioRegistro")
    public String verFomularioRegistro(Model model) {
        //debemos guardar los datos en un objeto alumno
        Alumno alumno = new Alumno();
        model.addAttribute("alumno", alumno);
        return "formularioAlumnoIngreso";
    }

    @RequestMapping("/procesaFormularioAlumnos")
    public String procesaFormularioAlumnos() {
        return "formularioAlumnosProcesados";
    }

    @RequestMapping("/procesarFormularioAlumnosIngreso")
    public String procesarFormularioAlumnosIngreso(@ModelAttribute("alumno") Alumno alumno) {
        return "formularioAlumnoIngresoProcesado";
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
