package com.my;

public class TestSplit
{

	public static void main(String[] args)
	{
		
//		testSplit();
		
	}

	private static void testSplit() {
		{
			String str = "101.102";
			String[] strs = str.split("\\.");
			System.out.println(strs.length);
			System.out.println(strs[0]);
			System.out.println(strs[1]);
		}

		{
			// 这里只有拆分成一个字符串
//			String str = ".";
//			String[] strs = str.split("\\.");
//			System.out.println(strs.length);
//			System.out.println(strs[0]);
//			System.out.println(strs[1]);
		}
	}

}
