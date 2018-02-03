package com.my.ex5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test008_LocalDate
{

	public static void main(String[] args)
	{
		
		// 各个不同的时间类有不同的对应的格式化工具
		System.out.println(LocalDate.parse("2014-05-04")
							.format(DateTimeFormatter.ISO_DATE)
				);
	}

}
