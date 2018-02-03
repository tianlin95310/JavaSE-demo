package com.tl;

public class TestClass
{

	public static final int MY_VALUE = 10;
	
	/**
	 * 作为值传入时，要求是常量
	 */
	@MethodAnnotation1(test = MY_VALUE)
	private static void fun1()
	{
		System.out.println("调用指定注解值的函数");
	}
	
//	@MethodAnnotation2(10)
	@MethodAnnotation2(value = 10)
	private void fun2()
	{
		System.out.println("fun2");
	}
}
