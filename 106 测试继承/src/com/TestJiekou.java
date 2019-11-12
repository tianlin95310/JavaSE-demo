package com;

interface A
{
}

class B implements A
{
	
}
public class TestJiekou
{

	public static void main(String[] args)
	{
		A a = new B();
		B b = new B();
		System.out.println(a instanceof Object);
		System.out.println(b instanceof Object);

	}

}
