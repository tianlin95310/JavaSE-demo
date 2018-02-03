package com.my.ex5;

public class Test235_refre_return
{

	private int b;
	public static int fun1(){
		int a = 0;
		return a;
	}
	
	public static Test235_refre_return fun2()
	{
		return new Test235_refre_return();
	}
	public static void main(String[] args)
	{
		// 引用返回，并且返回的引用本身是不能做修改的，我们只能修改引用所指向的内容
		System.out.println(fun2().b = 5);	
		// 因为这个修改直接修改是没有任何意义的，因为我们无法获取新的对象的引用
//		System.out.println(fun2() = new Test235_refre_return());	
		
//		System.out.println((fun1() = 7));	// 普通类型不能重新赋值
	}

}
