package com.getthesamedecimal;

public class GetTheSameDecimal
{

	public static void main(String[] args)
	{
//		int a[] = {1, 2, 22, 42, 2}; 
		int a[] = {24, 52, 38, 10, 52};
		System.out.println(getn(a, a.length));
		
	}
	
	public static int getn(int[] a, int n)
	{
		int row = 14;
		int td[][] = new int[row][3];
		
		for(int i = 0; i < td.length; i++)
		{
			for(int j = 0; j < td[i].length; j++)
			{
				td[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 0; i < n ;i++)
		{
			int temp = a[i] % row;
			
			int j = 0;
			for(j = 0; j < td[temp].length; j++)
			{
				if(a[i] == td[temp][j])
					return a[i];
				
				if(td[temp][j] == Integer.MAX_VALUE)
				{
					td[temp][j] = a[i];
				}
			}
			
			if(j == td[temp].length)
				return getn2(a, n);
		}
		
		return -1;
	}
	public static int getn2(int[] a, int n)
	{
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(a[i] == a[j])
					return a[i];
			}
		}
		return -1;
	}

}
