package web.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//CodigoPostalMadridValidation -> es la clase donde se hace la validacion
@Constraint(validatedBy = CodigoPostalMadridValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD }) // esto quiere decir que la validacion puede ir a metodos  o a campos
@Retention(RetentionPolicy.RUNTIME) //indica cuando se chequea si la validacion se cumple o no, nosotros la queremos validar cuando la app se esta ejecutando, asi qeu lo ponemos en runtime
public @interface CodigoPostalMadrid {

    //definir el codigo portal por defecto
    public String  value() default "28";

    //definir el mensaje de error
    public String message() default "El codigo postal debe comenzar con 28";

    //definir los grupos
    Class<?>[] groups() default {};

    //definir los payloads
    Class<? extends Payload>[] payload() default {};
}
