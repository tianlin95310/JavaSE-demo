package com.superclass;

public class Super
{
	private Test test1 = new Test();
	protected Test test2 = new Test();
	
	public void fun1()
	{
		System.out.println("fun1");
		
		// 因为Super与Test同包，所以他能访问Test的protected属性
		test1.fun3();
	}
	
	protected void fun2()
	{
		System.out.println("fun2");
	}
	
	public Test getTest1()
	{
		return test1;
	}
	
	public Test getTest2()
	{
		return test2;
	}
}



