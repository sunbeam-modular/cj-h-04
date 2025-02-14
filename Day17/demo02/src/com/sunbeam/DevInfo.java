package com.sunbeam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Few annotations like @Retention, @Target, 
@Inherited, etc are designed to decide
the behavior of the custom annotations.
They are called as "Meta-annotations".
*/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DevInfo {
	String value(); // author -- default attribute
	String designation() default "Sw Dev";
	String company() default "Sunbeam";
}
