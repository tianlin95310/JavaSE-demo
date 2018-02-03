package com.teslambda;
// 测试静态方法，与对象方法
interface YuJieXiFu<T, K>
{
	T operate(K k);
}

class Person
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	public Person()
	{
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + "]";
	}
	
}
// 测试构造方法
interface Construction
{
	Person create(String name);
}
public class TestYuJieXiFu
{

	public static void main(String[] args)
	{
		// 1，自己实现内部类，发现该方法就是将一个String的形参做过操作后变成Integer的一个过程
		YuJieXiFu<Integer, String> test1 = new YuJieXiFu<Integer, String>(){
			@Override
			public Integer operate(String k)
			{
				return null;
			}
		};
		
		YuJieXiFu<Integer, String> test2 = Integer::valueOf;
		// 而刚好Integer.valueOf(k)也是将一个String的形参，通过操作返回Integer的过程，所以
		// 我们可以直接用Integer.valueOf(k)的实现
		// 代码相当于
//		@Override
//		public Integer operate(String k)
//		{
//			return Integer.valueOf(k);
//		}
		
		System.out.println(test1.operate("123"));
		System.out.println(test2.operate("123"));
		
		// 2，引用对象的方法
		String str = "java";
		YuJieXiFu<Integer, String> test3 = str::indexOf;	//相当于str.indexOf();
		System.out.println(test3.operate("v"));
		// 接口operate方法变成
//		@Override
//		public Integer operate(String k)
//		{
//			return str.indexOf(k);
//		}
		
		// 3，引用构造方法，不用指定是哪一个构造函数，他会自动匹配
		Construction con = Person::new;
		Person p = con.create("tianlin");
		System.out.println(p);
	}

}
