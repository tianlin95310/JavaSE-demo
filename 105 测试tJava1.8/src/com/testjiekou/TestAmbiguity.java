package com.testjiekou;

@FunctionalInterface
interface A
{
	default void fun1()
	{
		System.out.println("i am A");
	}
	void fun2();
}
@FunctionalInterface
interface B
{
	default void fun1()
	{
		System.out.println("i am B");
	}
	void fun2();
}

class C implements A,B
{
	/**
	 * fun2是没有二义性的，因为接口中都只有声明，没有实现，只有一个版本
	 */
	@Override
	public void fun2()
	{
	}

	/**
	 * fun1是有二义性的，因为A,B的fun1都有具体的实现，所以存在二义性，只有重写fun1才能解决问题
	 * c++里是通过虚基类来消除二义性的
	 */
	@Override
	public void fun1()
	{
		// 调用接口的默认方法
		B.super.fun1();
	}
	
	
}
public class TestAmbiguity
{

	public static void main(String[] args)
	{
		new C().fun1();
	}

}
