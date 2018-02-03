package com.teslambda;

interface TestLambda
{
	void fun();
}
class My1
{
	private int a = 10;
	
	public void fun()
	{
		final int b = 5;
		TestLambda test = () -> System.out.println(a + ":" + b);
		test.fun();
	}
}

public class TestScope
{
	public static void main(String[] args)
	{
		new My1().fun();
	}

}
