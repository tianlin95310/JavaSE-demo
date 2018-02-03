package com.my.ex5;

class TestInit
{
	byte v1;
	char v2;	// 默认为空字符' ';
	short v3;
	int v4;
	long v5;
	float v6;
	double v7;
	boolean v8;	// 默认为false
	
//	0
//	0
//	0
//	0
//	0
//	0.0
//	0.0
//	false
	
	public TestInit()
	{
		System.out.println(v1);
		System.out.println((int)v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		
//		0
//		0
//		0
//		0
//		0
//		0.0
//		0.0
//		false
	}
}
public class Test033_init_int
{

	public static void main(String[] args)
	{
		
		new TestInit();
		byte v1 = 1;		// 不超过范围才能赋值
		byte b = (byte) 500;// 超过范围要强转
		char v2 = 1;
		short v3 = 1;
		int v4 = 1;
		long v5 = 1;		// 用long来接受int没问题
		float v6 = 1.0f;
		double v7 = 1.0;	// 1.0默认为double
		boolean v8 = false;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		
		Long ll = 1L;	// 这里必须要加L，表示long
		// 自动拆箱，装箱只能针对同类型的，如int -> Integer
		// long -> Long，不支持int到Long
		
	}

}
