package com.my.BigDecamil;

import java.math.BigDecimal;

public class TestDecimal
{

	public static void main(String[] args)
	{
		
		BigDecimal decimal1 = new BigDecimal("3");
		BigDecimal decimal2 = new BigDecimal("012.8");
		
		System.out.println(decimal1.floatValue());
		System.out.println(decimal1.intValue());
		System.out.println(decimal2);
		
		System.out.println(new BigDecimal("13.4").equals(decimal1.add(decimal2)));
		
		decimal1.add(new BigDecimal("4"));
		System.out.println(decimal1.floatValue());
		
	}
}
