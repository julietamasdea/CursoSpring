package web;

import web.validations.CodigoPostalMadrid;

import javax.validation.constraints.*;

public class Alumno {
    @NotNull
    @Size(min=2, message = "El nombre no puede ser vacio o tener menos de dos caracteres")
    private String nombre;
    @NotNull
    @Size(min=2, message = "El apellido no puede ser vacio o tener menos de dos caracteres")
    private String apellido;
    private String asignaturaOptativa;
    private String genero;
    private String deporte;
    @Email(message = "Email should be valid")
    private String email;
    @Min(value = 18, message = "La edad no puede ser menor de 18")
    @Max(value = 150, message = "La edad no puede ser mayor de 150")
    private String edad;
    @CodigoPostalMadrid
    @Pattern(regexp="[0-9]{5}", message = "El codigo postal debe tener 5 valores numericos")
    //@Pattern(regexp="[0-9a-zA-Z]{5}", message = "") si quiero que ademas tenga letras
    private String codigoPostal;

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFavouriteWord() {
        return email;
    }

    public void setFavouriteWord(String email) {
        this.email = email;
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
