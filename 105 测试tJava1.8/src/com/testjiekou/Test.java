package com.testjiekou;

interface Java8
{
	class A{}
	interface B{}
	abstract class C{}
	int A = 10;
	static void fun()
	{
		System.out.println("java8中可以有已经实现的静态方法");
	}
	default void fun1()
	{
		System.out.println("java8中可以有已经实现的默认方法");
	}
	void fun2();
}


class TestJava8 implements Java8
{
	@Override
	public void fun2()
	{
		Java8.super.fun1();
		System.out.println("实现接口的普通抽象方法");
	}
	@Override
	public void fun1()
	{
		Java8.super.fun1();
		System.out.println("重写接口的默认方法");
	}
}
public class Test
{
	public static void main(String[] args)
	{
//		Test test = Test::new;
		
		// 调用接口的默认方法
		new TestJava8().fun2();
		
	}

}
