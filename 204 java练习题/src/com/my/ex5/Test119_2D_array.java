package com.my.ex5;

public class Test119_2D_array
{

	public static void main(String[] args)
	{

		
		String str = null;
		str = str + 1;
		System.out.println(str);
		
		Integer i1 = null;
		i1 = i1 + 1;
		System.out.println(i1);
		
		int a[][] = new int[2][];
		
		a[0] = new int[2];
		a[1] = new int[3];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length ; j ++)
			{
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
