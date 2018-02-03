package com.my;

public class Test1
{

	public static void main(String[] args)
	{
		String str1 = "0";
		String str2 = str1.replaceFirst("^[0]+", "");
		
		System.out.println(str2);
	}

}
