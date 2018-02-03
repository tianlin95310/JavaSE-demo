package com.my;


class Template<T>
{
	T content;

	public T getContent()
	{
		return content;
	}

	public void setContent(T content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return "Template [content=" + content + "]";
	}
	
	
	
}
public class Test
{

	public static void main(String[] args)
	{

		Template t1 = new Template();
		
		//
		Template<Object> t2 = new Template<>();
		Template<String> t3 = new Template<>();
		Template<Integer> t4 = new Template<>();
		
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());
		System.out.println(t3.getClass().getName());
		System.out.println(t4.getClass().getCanonicalName());

		
		
		// 不带参数的,可以接受任何的泛型类型，他是未知类型
		t1 = t2;
		t1 = t3;
		t1 = t3;
		// 带有泛型参数的,不能与其他类型相互转化,因为泛型参数会成为类型的一部分(特殊情况)
		// 类型不同，他们会属于不同的类型
		t2 = t1;
//		t2 = t3;
//		t2 = t4;
		
		t3 = t1;
//		t3 = t2;
//		t3 = t4;
		
		t4 = t1;
//		t4 = t2;
//		t4 = t3;
		
	}

}
