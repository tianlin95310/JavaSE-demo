package com.my.ex5;

import java.util.ArrayList;

public class Test158_list_no_type
{

	public static void main(String[] args)
	{

		ArrayList list = new ArrayList<>();
		list.add("asd");
		list.add(123);
		
		System.out.println(list);
		// 这里虽然不知道是什么具体类型，为Object类型，但
		// list的toString是调用每个元素自己的toString，添加的是什么对象，调用的就是那个对象的toString
	}

}
