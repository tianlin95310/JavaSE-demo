package com.subclass;

import com.superclass.Super;

public class SubClass extends Super
{

	@Override
	protected void fun2()
	{
		// 获取基类属性的4中方式
		// 1，直接访问，因为在子类中
		test2.fun4(); // 不同
//		test2.fun3(); // 当前包下的对象不能访问Test的protected属性
		
		// 2，通过public方法
		getTest2().fun4();
		
		// 3，通过super，要求可见
		super.test2.fun4();	
		
		// 4，通过this，要求可见
		this.test2.fun4();	
	}
}


