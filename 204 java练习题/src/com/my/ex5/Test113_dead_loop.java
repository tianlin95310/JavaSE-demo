package com.my.ex5;

import java.util.ArrayList;

public class Test113_dead_loop
{

	public static void main(String[] args)
	{
		
		System.out.println("begin");
		try
		{
			stackoverflow();
		} catch (StackOverflowError e)
		{
			System.out.println("StackOverflowError");
		}

		System.out.println("end");
	}
	
	public static void stackoverflow()
	{
		stackoverflow();
	}
	
	public static void outofmem()
	{
		// Error是运行时异常，通常不由函数抛出
		System.out.println("begin");
		ArrayList<String> list = new ArrayList<>();
		try
		{
			while(true)
			{
				list.add("string");
			}
		} 
		catch (RuntimeException e)
		{
			System.out.println("RuntimeException");
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("OutOfMemoryError");
		}
		
		System.out.println("end");
	}

}
