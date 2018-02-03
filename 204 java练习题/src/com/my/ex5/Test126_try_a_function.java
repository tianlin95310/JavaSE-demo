package com.my.ex5;

public class Test126_try_a_function
{

	public static void fun() throws RuntimeException 
	{
		System.out.println("fun start");
		int a = 1 / 0; 		
		System.out.println("fun end");
		
	}
	public static void main(String[] args)
	{

		try
		{
			fun();
		}
		catch(RuntimeException e)
		{
			System.out.println("RuntimeException");
		}
		
		System.out.println("end");
	}

}
