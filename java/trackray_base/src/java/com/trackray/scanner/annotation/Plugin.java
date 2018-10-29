package com.trackray.scanner.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Plugin {
    String value() default "";
    String title();
    String desc() default "";
    String author() default "anonymous";
    String link() default "";
}
