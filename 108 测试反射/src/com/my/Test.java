package com.my;

import java.lang.reflect.Type;

class C
{
	public void fun()
	{
	}

}

interface A
{
	public static final Class<?> clazz = A.class;

	static void call()
	{
		/**
		 * 静态方法不能直接调用非静态方法 因为toString是一个对象方法，类和静态方法加载时，此时对象肯定是没有创建的
		 */
		// System.out.println(toString());

		/**
		 * 下面能调用，因为他已经产生对象了，这中间应该有一种检查机制
		 */
		String s = new String();
		s.toString();
	}

	default void fun()
	{
		/**
		 * 因为Object也会继承Object,但接口却是不能继承其他的类的，只能继承接口 所以这里是比较特殊的，经默认方法或者
		 * 
		 */
		System.out.println(toString());
	}
}

class B implements A
{

}

public class Test extends Object
{

	public static void main(String[] args)
	{
		int a[] = new int[4];
		B b = new B();
		String c = "";

		// System.out.println(a instanceof Type);

		System.out.println(b instanceof A);
		System.out.println(b instanceof Type);

		// System.out.println(c instanceof Type);

	}

	public void test2()
	{
		Test t = new Test();
		// t.test();

		/**
		 * 接口也会默认继承Object类，这算是一个新特性，之前的接口里不允许有 具体的方法，所以
		 */
		A a = new B();
		B b = new B();
		System.out.println(a instanceof Object);
		System.out.println(b instanceof Object);

		b.fun();
		System.out.println(b.toString());

		/**
		 * 获取接口的接口名
		 */
		System.out.println(A.clazz.getSimpleName());

	}

	public void test()
	{
		Class<?> class1 = Test.class;
		/**
		 * 普通的数据类型他也有class属性
		 */
		Class<?> class2 = int.class;
		Class<?> class3 = Integer.TYPE;
		Class<?> class4 = Integer.class;

		/**
		 * void，Void都不能定义 Void可以声明变量
		 */
		Class<?> class5 = void.class;
		Class<?> class6 = Void.TYPE;
		Class<?> class7 = Void.class;

		System.out.println(class1.getSimpleName());

		System.out.println(class2.getSimpleName());
		System.out.println(class3.getSimpleName());
		System.out.println(class4.getSimpleName());

		System.out.println(class5.getSimpleName());
		System.out.println(class6.getSimpleName());
		System.out.println(class7.getSimpleName());

	}

}
