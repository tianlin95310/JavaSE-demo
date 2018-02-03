package com.my.ex5;

public class Test157_data_object
{

	public static void main(String[] args)
	{
		// 带有数字的特殊字符D,F,L没有问题，但带有下划线反而出问题,但基本的数据类型是可以有下划线的
		Double v1 = Double.valueOf("2000");
		double v3 = 1_2_3D;
		double v2 = Double.parseDouble("1_0_00d");
		System.out.println(v3);
		System.out.println(v1);
		System.out.println(v2);
		
		
	}

}
