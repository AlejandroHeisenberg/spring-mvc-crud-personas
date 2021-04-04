package Entidad;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Alejandro Reyes
 */
public class PersonaValidation implements Validator {

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
        return Persona.class.isAssignableFrom(type);

    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Persona persona = (Persona) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "DNI",
                "required.DNI",
                "EL campo DNI no puede estar vacio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "nombres",
                "required.nombres",
                "EL campo  nombre es incorrecto o esta vacio el campo.");
    }

}
