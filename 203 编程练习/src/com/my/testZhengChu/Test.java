package com.my.testZhengChu;

public class Test
{

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println(5 / 2 + ":" + 5 / 3);
						// 2 --- 1		1 --- 2
		
		System.out.println(5 / -2 + ":" + 5 / -3);
						// -2 --- 1		-1 --- 2
		
		System.out.println(-5 / -2 + ":" + -5 / -3);
						// 2 --- -1		1 --- -2
		
		System.out.println(-5 / 2 + ":" + -5 / 3);
						// -2 --- -1	-1 --- -2
		
		System.out.println("----------------------------------------------");
		System.out.println(5 % 2 + ":" + 5 % 3);
		System.out.println(5 % -2 + ":" + 5 % -3);
		System.out.println(-5 % -2 + ":" + -5 % -3);
		System.out.println(-5 % 2 + ":" + -5 % 3);
		
		// 总结
		// 1，如果被除数为正数，余数一定为正数；如果被除数为负数，则余数也为负数
		// 2，如果被除数与除数的符号相反，则整除结果为负数；如果被除数与除数的符号相同，则整除结果为正数
		// 3，如果除数为正数，则余数小于除数；如果除数为负数，则余数大于除数
		
	}

}
