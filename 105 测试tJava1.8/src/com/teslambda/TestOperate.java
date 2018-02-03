package com.teslambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestOperate
{

	public static void fun(String str)
	{
		System.out.print(str + ":");
	}
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < 20; i++)
		{
			list.add("" + (i + 1));
		}

		// 1，list的1.8新方法
//		list.forEach((i) -> System.out.print(i));
//		System.out.println();

		// 2,Stream的使用

		// 2.1 通过list新添加的方法获取stream对象
		Stream<String> stream = list.stream();

		// 2.2 通过stream遍历，他已经与list绑定,foreach是一个最終操作，结束之后能继续进行操作
		// stream.forEach((i) -> System.out.print(i));

		// 2.3 使用Predicate接口，用作filter的参数，表示筛选条件
		Predicate<String> p1 = (String str) -> str.contains("1");

		// 2.4 使用Consumer接口，单个操作,参数与对应的函数
		Consumer<String> c1 = str -> fun(str);

//		// 2.5 Function的使用，将String类型的值转化为Integer的值
		Function<String, Integer> fun1 = Integer::parseInt;
//		System.out.println(fun1.apply("456"));
		
//		// 2.6 Supplier的使用，返回一个Integer类型的值
		Supplier<Integer> sup = () -> 123456;
//		System.out.println(sup.get());
		
		// 2.7 filter是一个中间操作,foreach是一个最終操作
//		 stream.filter(p1).forEach(c1);

		// 2.8 count是一个最终操作，得到stream中元素个数
//		System.out.println(stream.count());
		
		// 2.9 采用默认排序
//		stream.sorted().forEach(c1);
		
		// 3.0 采用自定义排序,采用降序排序
//		Comparator<String> compare = (String obj1, String obj2) -> obj2.compareTo(obj1);
//		stream.sorted(compare).forEach(c1);
		
		// 3.1 截取前面N个元素
//		stream.limit(15).forEach(c1);
		
		// 3.2 map的使用，通过fun2 将Stream<String>类型转化为Stream<Integer>类型，
//		Function<String, Integer> fun2 = (String str) -> Integer.parseInt("10" + str);
//		stream.map(fun2).forEach(i -> System.out.print(i + " "));
		
		// 3.3 将所有的元素合并到一起，按顺序两个两个元素一组
//		BinaryOperator<String> bo = (i1, i2) -> i1 + "#" + i2;
//		Optional<String> optional = stream.reduce(bo);
		// 得到合并后的元素
//		System.out.println("\n" + optional.get());
		
	}

}
