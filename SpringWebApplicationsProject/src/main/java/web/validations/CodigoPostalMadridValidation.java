package web.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodigoPostalMadridValidation implements ConstraintValidator<CodigoPostalMadrid, String> {

    private String codigoMadrid;
    @Override
    public void initialize(CodigoPostalMadrid constraintAnnotation) {
        codigoMadrid=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //En s esta el valor que ingresa el usuario
        return s != null && s.startsWith(codigoMadrid);
    }
}
