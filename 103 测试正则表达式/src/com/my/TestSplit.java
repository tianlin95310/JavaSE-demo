package com.my;

public class TestSplit
{

	public static void main(String[] args)
	{
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
		
		{
			// 只去掉第一个0
			String str = "0.1010";
			System.out.println(str.replaceFirst("0", ""));
		}
		{
			System.out.println(Double.parseDouble("12."));
			System.out.println(Double.parseDouble(".50"));
		}

	}

}
