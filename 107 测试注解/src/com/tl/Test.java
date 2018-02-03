package com.tl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test
{
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class<?> clazz = TestClass.class;
		
		Method method = clazz.getDeclaredMethod("fun1");
		MethodAnnotation1 methodAnnotation1 = method.getAnnotation(MethodAnnotation1.class);

		if(TestClass.MY_VALUE == methodAnnotation1.test())
		{
			method.setAccessible(true);
			method.invoke(null);
		}
		
	}

}
