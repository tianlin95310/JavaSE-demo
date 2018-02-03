package com.my;

public class Test
{

	public static void main(String[] args)
	{

		String str1 = "ss";
		
		// 一次或多次
		System.out.println(str1.matches("s+"));
		
		// 既包含字母也有数字，并且为8个,$匹配结尾，一块一块的，如qwer一块，1234一块
		// 第一个$表示统计前面字母的个数，第二个则是统计数字的
//		String str2 = "qwer1234";
		String str2 = "qwe12rty";
		System.out.println(str2.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8}$"));
		
		String str3 = "qwe12345"; 
		System.out.println(str3.matches("^(?![0-9]+)(?![a-zA-Z]+$)[0-9A-Za-z]{8}$"));
		
		String str4 = "12345qwe"; 
		System.out.println(str4.matches("^(?![0-9]+$)(?![a-zA-Z]+)[0-9A-Za-z]{8}$"));
		
	}

}
