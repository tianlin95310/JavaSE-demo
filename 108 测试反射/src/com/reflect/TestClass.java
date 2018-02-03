package com.reflect;

public class TestClass
{

	static private String field1;
	String field2;
	protected String field3;
	public String field4;
	
	private void fun1()
	{
		System.out.println("通过反射调用方法fun1");
	}
	void fun2()
	{
		System.out.println("通过反射调用方法fun2");
	}
	static protected void fun3()
	{
		System.out.println("通过反射调用方法fun3");
	}
	public void fun4()
	{
		System.out.println("通过反射调用方法fun4");
	}
	public TestClass()
	{
		super();
	}
	public TestClass(String field1, String field2, String field3, String field4)
	{
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
	}
	
	
	
}
