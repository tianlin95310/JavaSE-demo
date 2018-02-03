package com.my.ex5;

public class Test093_2D_array
{

	public static void main(String[] args)
	{
		String[][] strs = new String[3][];
		
		strs[0] = new String[]{"aaa", "bbb"};
		strs[1] = new String[]{"aaa", "bbb", "ccc"};
		strs[2] = new String[]{"aaa"};
		
		for(int i = 0; i < strs.length; i++)
		{
			for(int j = 0; j < strs[i].length; j++)
			{
				strs[i][j] = strs[i][j].toUpperCase();
				System.out.print(strs[i][j] + " ");
			}
			System.out.println();
		}

	}

}
