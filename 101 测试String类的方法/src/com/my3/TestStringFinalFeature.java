package com.my3;

public class TestStringFinalFeature
{

	public String fun()
	{
		return "ab" + 1;
	}

	
	public static void main(String[] args)
	{
		int i = 1;
		String str = "ab1";
		String str2 = "ab" + i;
		String str3 = "ab" + 1;
		
		
		String str4 = "ab";
		String str5 = str4 + 1;
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str == str5);
	}

}
