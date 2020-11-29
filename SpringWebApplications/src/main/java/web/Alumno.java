package web;

public class Alumno {
    private String nombre;
    private String apellido;
    private String asignaturaOptativa;
    private String genero;
    private String deporte;
    private String favouriteWord;


    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFavouriteWord() {
        return favouriteWord;
    }

    public void setFavouriteWord(String favouriteWord) {
        this.favouriteWord = favouriteWord;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

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
