package oop.linking;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Ann1 {
    int value();
    String s() default "Мама мыла раму!";
}
