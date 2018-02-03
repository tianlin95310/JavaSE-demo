package com.my.ex5;


class ExceptionA extends Exception
{
	private static final long serialVersionUID = 1L;
	
}

class ExceptionB extends Exception
{
	private static final long serialVersionUID = 2L;
	
}

class C
{
	String str;
	
	int age;
	
	C(String str, int age) throws Exception
	{
		if(str == null)
			throw new ExceptionA();
		else if(age > 100)
		{
			throw new ExceptionB();
		}
		else
		{
			this.str = str;
			this.age = age;
		}
	}

	@Override
	public String toString()
	{
		return "C [str=" + str + ", age=" + age + "]";
	}
	
	
}

public class Test016_Exception
{

	public static void main(String[] args)
	{
		C c1 = null;
		C c2 = null;
		
		try
		{
			c1 = new C("aaa", 200);
			
			c2 = new C("bbb", 40);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(c1);
		System.out.println(c2);
		
		// IOException， Ecxeption属于受检必须捕获
		// RuntimeException属于非受异常
		// 异常捕获之后，异常后面try的代码不会执行，但catch会执行，finally会执行
		// 哪怕在catch里有return
	}

}
