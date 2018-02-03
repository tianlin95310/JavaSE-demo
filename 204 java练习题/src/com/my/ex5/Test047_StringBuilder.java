package com.my.ex5;

public class Test047_StringBuilder
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("1234");
		sb.insert(4,  "a");		// 跟String一样，如果超过了字符串的长度，会有异常
		sb.insert(1, "qwer");	// 将字符串插入到index个位置上，index从0开始
		System.out.println(sb);

	}

}
