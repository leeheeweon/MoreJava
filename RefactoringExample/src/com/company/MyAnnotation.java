package com.company;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
public @interface MyAnnotation {

    String value() default "heeweon";

    int number() default 100;
}
