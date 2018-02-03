package com.my.ex5;

class My75
{
	String str;
	boolean bool;
	double d;
	
	My75()
	{
		this.str = "123";
		this.bool = true;
		this.d = 100;
	}

	@Override
	public String toString()
	{
		return "[str=" + str + ", bool=" + bool + ", d=" + d + "]";
	}
	
}
public class Test075
{

	public static void main(String[] args)
	{
		My75 my75 = new My75();
		
//		my75.str = "123";
//		my75.bool = true;
//		my75.d = 100;
		
		System.out.println(my75);
	}

}
