package com.example.demo.hibernate_validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IdValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
    String message() default "Id must prefix with SOS";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
