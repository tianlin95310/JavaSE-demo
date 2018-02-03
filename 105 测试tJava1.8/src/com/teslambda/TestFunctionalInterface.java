package com.teslambda;

/**
 * @FunctionalInterface要求它对应的接口只能有一个抽象函数,可以有默认函数,可以有静态函数
 * @author Administrator
 * @param <T>
 */
@FunctionalInterface
interface Java8<T>
{
	default void fun(){}
	Integer fun(T t);
	static void fun(int a){}
}

class My
{
}
public class TestFunctionalInterface
{

	public static void main(String[] args)
	{
		
		// 1，接口引用-lambda表达式用法
		// 写法1
//		Java8<String> java1 = (param) -> Integer.parseInt(param);
		Java8<String> java1 = param -> Integer.parseInt(param);
		// 写法2
		Java8<String> java2 = (param) -> { return Integer.parseInt(param);};
		// 写法3
		Java8<String> java3 = (String param) -> { return Integer.parseInt(param);};
		
		System.out.println(java1.fun("123"));
		System.out.println(java2.fun("123"));
		System.out.println(java3.fun("123"));
		
	}

}
