package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class TestReflect
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class<?> clazz = TestClass.class;
		StringBuilder sb = new StringBuilder(1000);
		
		/**
		 * 字段
		 */
		Field[] fields = clazz.getDeclaredFields();
		for(int i = 0; i < fields.length; i++)
		{
			Field field = fields[i];
			
			sb.append(Modifier.toString(field.getModifiers()) + " " + field.getName() + ";" + "\n");
		}
		
		/**
		 * 构造
		 */
		Constructor<?> constructors[] = clazz.getDeclaredConstructors();
		
		for(int i = 0; i < constructors.length ; i++)
		{
			Constructor<?> constructor = constructors[i];
			// 修饰符
			sb.append(Modifier.toString(constructor.getModifiers()) + " ");
			sb.append(constructor.getName() + " (");
			
			Parameter []parameters = constructor.getParameters();
			for(int j = 0; j < parameters.length ; j++)
			{
				Parameter p = parameters[i];
				// 参数类型，参数名
				sb.append(p.getType().getSimpleName() + " " + p.getName() + ", ");
			}
			sb.append(")\n");
		}
		
		/**
		 * 方法
		 */
		Method[] methods = clazz.getDeclaredMethods();
		
		for(int i = 0; i < methods.length ; i++)
		{
			Method method = methods[i];
			sb.append(Modifier.toString(method.getModifiers()) + " ");
			sb.append(method.getReturnType().getSimpleName() + " ");
			sb.append(method.getName() + "(");
			
			Parameter []parameters = method.getParameters();
			for(int j = 0; j < parameters.length ; j++)
			{
				Parameter p = parameters[i];
				// 参数类型，参数名
				sb.append(p.getType().getSimpleName() + " " + p.getName() + ", ");
			}
			
			sb.append(")\n");
		}
//		System.out.println(sb.toString() + "\n");
		
		/**
		 * 通过反射构造对象的public方法
		 */
		Constructor<?> constructor = clazz.getConstructor();
		TestClass testClass = (TestClass) constructor.newInstance();
		testClass.fun4();
		
		/**
		 * 通过反射调用对象的private方法
		 */
		
		Method method = clazz.getDeclaredMethod("fun1");
		method.setAccessible(true);
		method.invoke(testClass);
	}

}
