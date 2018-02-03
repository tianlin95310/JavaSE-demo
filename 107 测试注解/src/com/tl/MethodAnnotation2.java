package com.tl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodAnnotation2
{
	/**
	 * 定义注解的属性成员，为value时，在使用的时候可以省略value=
	 * @return
	 */
	int value();
}
