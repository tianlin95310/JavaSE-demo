package com.my.ex5;

public class Test040_foreach
{
	public static void main(String[] args)
	{
		int a[][] = {{1, 2, 3}, {4, 5, 6}};
		
		// foreach遍历二维数组
		for(int[] b : a)
		{
			for(int c : b)
			{
				System.out.print("" + c);
			}
			System.out.println();
		}
		
		// i是每次从数组中取的
		int attr[] = {1, 3, 5};
		for(int i : attr)
		{
			System.out.println(i);
			i++;
		}
	}
}
