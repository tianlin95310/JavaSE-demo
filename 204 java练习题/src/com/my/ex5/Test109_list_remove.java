package com.my.ex5;

import java.util.ArrayList;
import java.util.List;

public class Test109_list_remove
{

	public static void main(String[] args)
	{

		List<String> list = new ArrayList<>();
		
		list.add("se");
		list.add("ee");
		list.add("me");
		list.add("se");
		list.add("ee");
		
		// 只会判断第一个
		System.out.println(list.indexOf("ee"));
		// 只会删除第一个
		list.remove("se");
		
		System.out.println(list);
	}

}
