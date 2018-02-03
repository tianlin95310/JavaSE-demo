package com.my.ex5;

import java.util.ArrayList;
import java.util.List;

public class Test146_list_remove
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		// object为参数的方法是有boolean返回值的
		boolean bool = list.remove(list);
	}

}
