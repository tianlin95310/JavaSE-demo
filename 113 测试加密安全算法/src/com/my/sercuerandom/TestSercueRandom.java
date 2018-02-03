package com.my.sercuerandom;

import java.security.SecureRandom;

public class TestSercueRandom
{

	public static void main(String[] args)
	{

		SecureRandom secureRandom = new SecureRandom();
		
		System.out.println("------------------secureRandom------------------");
		for(int i = 0; i < 10; i++)
		{
			System.out.println((int)(secureRandom.nextDouble() * 10000));
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("------------------Math.random------------------");
		for(int i = 0; i < 10; i++)
		{
			System.out.println((int)(Math.random()* 10000));
		}
	}

}
