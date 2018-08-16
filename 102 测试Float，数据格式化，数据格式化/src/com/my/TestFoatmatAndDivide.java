package com.my;

import java.text.DecimalFormat;

/**
 * "IEEE的浮点数
 * 
 * @author Administrator
 *
 */
public strictfp class TestFoatmatAndDivide
{

	public strictfp static void main(String[] args)
	{

		{
			DecimalFormat df = new DecimalFormat("######0.00");

			System.out.println(df.format(12123123123132.5678));
			System.out.println(df.format(12.1234));

		}

		{
			double d = 0;
			double div1 = 0;
			int div2 = 0;

			// 对于浮点数，除数为0不会抛异常，而是无穷大，对于整形数，除数为0会抛异常
			if (div1 == 0)
				d = 1;
			else
				// try
				// {
				d = 1.0 / div1;
			// } catch (RuntimeException e)
			// {
			// d = 0;
			// }

			System.out.println(d);

		}
//		{
//			/**
//			 * 比较是小数位为0会自动被忽略
//			 */
//			float f = 1.0f;
//			if (f == 1)
//			{
//				System.out.println("yes");
//			} else
//				System.out.println("no");
//
//			Double double1 = Double.parseDouble("0.25");
//
//			System.out.println(double1 * 5);
//
//		}
	}

}
