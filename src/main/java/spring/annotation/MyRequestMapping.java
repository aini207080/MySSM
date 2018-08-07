package spring.annotation;

import spring.xmlRules.RequestMethod;

import java.lang.annotation.*;


@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    String value() default "";

    RequestMethod[] method() default {};

}


