package com.my.ex5;

public class Test052_try_catch_in_for
{

	public static void main(String[] args)
	{
		String[] names = new String[]{"Mary Brown", "Nancy Red", "Jessy Orange"};
		
		try
		{
			for(String s : names)
			{
				try
				{
					String str = s.substring(0, 3) + s.substring(6, 10);
					System.out.println(str);
				} catch (StringIndexOutOfBoundsException e)
				{
//					e.printStackTrace();
					
					System.out.println("string out of");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e)
		{
//			e.printStackTrace();
			System.out.println("out of bound");
		}
	}

}
