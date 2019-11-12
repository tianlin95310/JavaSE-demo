package com.math;

public class TestMathSinFun
{

	public static void main(String[] args)
	{

		// 角度转弧度
		System.out.println(Math.toRadians(30));
		// 求sin值
		System.out.println(Math.sin(Math.toRadians(30)));
		// 弧度转角度
		System.out.println(Math.toDegrees(0.5));
		// 求tan值
		System.out.println(Math.tan(Math.toRadians(45)));
		// 求1 的反正切，然后转成角度
		System.out.println(Math.toDegrees(Math.atan(1)));
	}

}
