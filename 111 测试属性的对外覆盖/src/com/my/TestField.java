package com.my;

class A
{
	public int a = 10;
}

class B extends A
{
	public int a = 20;
}
public class TestField
{
	public static void main(String[] args)
	{
		// 子类引用得到的属性是子类的
		B b1 = new B();
		System.out.println(b1.a);
		
		// 基类引用得到的属性是基类的
		A b2 = new B();
		System.out.println(b2.a);
	}

}
