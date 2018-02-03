package com.my.ex5;

public class Test147
{

	public static void main(String[] args)
	{

		for(int i = 0; i < 3; i++)
		{
			int count = 0;
			
			for(int j = 0; j < 3; j++)
			{
				if(i == j)
				{
					++count;
					break;
				}
			}
			
			System.out.print(count);
			continue;
		}
		
		// 清空sb
		StringBuilder sb = new StringBuilder();
		sb.delete(0, sb.length());
	}

}
