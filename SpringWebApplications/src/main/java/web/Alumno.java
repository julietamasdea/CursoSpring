package web;

public class Alumno {
    private String nombre;
    private String apellido;
    private String asignaturaOptativa;

    public String getAsignaturaOptativa() {
        return asignaturaOptativa;
    }

    public void setAsignaturaOptativa(String asignaturaOptativa) {
        this.asignaturaOptativa = asignaturaOptativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Alumno() {
    }
}
