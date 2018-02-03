package com.my.ex5;

import java.util.ArrayList;
import java.util.List;

public class Test038_number_class
{

	public static void fun(Integer i)
	{
		i = 20;
	}
	public static void main(String[] args)
	{
		Integer i1 = 100;	// 自动装箱
		i1 = 10 + ++i1;
		
		int i2 = i1;		// 自动拆箱，并且i1也能支持运算符操作
		System.out.println(i2);
		
		
		List<Long> list = new ArrayList<>();
		Long l1 = 100L;
		Long l2 = 200L;
		list.add(l1);
		list.add(l2);
		// 这里与String一样，这种类型引用本身只有一个值，若想改变只能用 = ，但一旦赋值，很有可能让他指向新的对象
		// 除非内容与他们一样，
		Long l3 = list.get(1);
		l3 = 300L;
		System.out.println(list.get(1));
	}

}
