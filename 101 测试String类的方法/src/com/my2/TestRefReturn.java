package com.my2;

import java.util.ArrayList;

class MyString
{
	public String str;
	
	public MyString(String str)
	{
		this.str = str;
	}
}
public class TestRefReturn
{

	public static String get()
	{
		return new String();
	}
	
	public static MyString getMy()
	{
		return new MyString("");
	}
	public static void main(String[] args)
	{

		{
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("qqq"));
		list.add(new String("www"));
		list.add(new String("eee"));
		list.add(new String("rrr"));
		
		// 我们不能修改返回的引用本身，只能修改引用指向的内存内容
//		list.get(2) = "test";
		
		}
		ArrayList<MyString> list = new ArrayList<>();
		
		list.add(new MyString("qqq"));
		list.add(new MyString("www"));
		list.add(new MyString("eee"));
		list.add(new MyString("rrr"));
//		String str = list.get(2);
//		str = "123";
//		str.substring(1, 2);
//		System.out.println(list.get(2));
		
		// 1，我们只能修改引用所指向的内容
		getMy().str = "";
		list.get(2).str = "";
		
	}

}
