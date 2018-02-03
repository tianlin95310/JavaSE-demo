package com.my.make_four_random_number;

import java.security.SecureRandom;

public class Test
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(getNumber(7));
		}
	}

	public static String getNumber(int numberLength)
	{
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder str_number = new StringBuilder(numberLength);
		for (int i = 1; i <= numberLength; i++)
		{
			str_number.append(secureRandom.nextInt(10));
		}
		return str_number.toString();

	}

}
