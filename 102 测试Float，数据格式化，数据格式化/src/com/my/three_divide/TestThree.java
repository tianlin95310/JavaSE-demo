package com.my.three_divide;

import java.text.DecimalFormat;

public class TestThree
{

//	public static final DecimalFormat df = new DecimalFormat("#,###.00");
	
	public static final DecimalFormat df = new DecimalFormat("#,###");
	public static void main(String[] args)
	{

//		System.out.println(df.format("0"));
		
//		System.out.println(df.format("1"));
		
//		System.out.println(df.format("12"));
		
//		System.out.println(df.format("123"));
		
//		System.out.println(df.format("1234"));
		
//		System.out.println(df.format("1234.1"));
		
//		System.out.println(df.format("1234.12"));
		
		System.out.println(df.format(0));
		System.out.println(df.format(1));
		System.out.println(df.format(12));
		System.out.println(df.format(123));
		System.out.println(df.format(1234));
		System.out.println(df.format(1234.1));
		System.out.println(df.format(1234.12));
		
	}

}
