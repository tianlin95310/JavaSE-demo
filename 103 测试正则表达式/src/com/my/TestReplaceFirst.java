package com.my;

public class TestReplaceFirst
{

	public static void main(String[] args)
	{
		
//		replaceFirst();
		
		String str1  = "0";
		if(str1.indexOf(".") == -1) {
			System.out.println("str1 = " + str1);
		}
		else {
			String str2 = str1.replaceAll("[0]+$", "");
			System.out.println("str2 = " + str2);
		}
	}

	private static void replaceFirst() {
		String str1 = "0";
		String str2 = str1.replaceFirst("^[0]+", "");
		
		System.out.println(str2);
		
	}

}
