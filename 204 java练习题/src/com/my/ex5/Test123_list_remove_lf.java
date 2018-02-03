package com.my.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test123_list_remove_lf
{

	public static void main(String[] args)
	{
		
		List<Integer> list = new ArrayList<>();
		
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		
		Predicate<Integer> p = (i) -> {return (i % 2 == 0);};
		list.removeIf(p);
		
		list.forEach(i -> System.out.println(i));
		

	}

}
