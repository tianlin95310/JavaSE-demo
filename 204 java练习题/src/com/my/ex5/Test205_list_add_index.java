package com.my.ex5;

import java.util.ArrayList;
import java.util.List;

public class Test205_list_add_index
{

	public static void main(String[] args)
	{
		
		// 索引超过字符串长度会抛异常
//		List<String> list = new ArrayList<>();
//		list.add(1, "asdsd");
//		System.out.println(list);
		
		String[] strs = new String[]{"aaa", "bbb"};
		
//		2，与String[] strs;不同的是strs[i]就是对象本身strs是这块堆内存的首地址，str[i]就是地址上的内容
//		str[i] = "newString";就是直接修改对象本身的内容，他与list不一样，list返回的是某个元素的地址
		strs[0].concat("ddd");
		for(String s : strs)
		{
			System.out.println(s);
		}
		
		{
			List<String> list = new ArrayList<>();
			
			list.add("aaa");
			list.add("bbb");
			list.add("ccc");
			
			// 但返回的引用不能立即给他指定一个新的空间
//			list.get(1) = "asd";
		}

		
		StringBuilder sb;
		
	}

}
