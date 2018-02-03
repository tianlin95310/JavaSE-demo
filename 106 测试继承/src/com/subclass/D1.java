package com.subclass;

import com.superclass.Super;

public class D1
{
	public void fun()
	{
		// 在D1于Super不同包时，子类对象是不可以访问protected属性的
		// 尽管D1是可以访问Super的
		SubClass sub = new SubClass();
//		sub.test2;
		
		// 但是他可以public方法，D1与Test不同包，所以他只能访问public方法
		sub.getTest2().fun4();
		
		// 可以访问Super类
		Super supers = new Super();
		// 不同包只能访问public方法
		supers.fun1();
		supers.getTest2().fun4();
	}
}

