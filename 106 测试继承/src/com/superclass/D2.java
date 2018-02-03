package com.superclass;

import com.subclass.SubClass;

public class D2
{
	public void fun()
	{
		// 在D2于Super同包时，子类对象是可以访问Super的protected属性的
		SubClass sub = new SubClass();
		sub.test2.fun3();
	}
}
