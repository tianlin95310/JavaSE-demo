package com.my.ex5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test071_new_calerder
{
	public static void main(String[] args)
	{
		
		DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter MonthFormat = DateTimeFormatter.ofPattern("yyyy/MM");
		
		// 默认时区得到的时间
		LocalDate localDate = LocalDate.now();
		
		System.out.println("当天" + dayFormat.format(localDate));
		Period preDay = Period.ofDays(-1);
		Period nextDay = Period.ofDays(1);
		System.out.println("前天" + dayFormat.format(localDate.plus(preDay)));
		System.out.println("后天" + dayFormat.format(localDate.plus(nextDay)));
		
		System.out.println(MonthFormat.format(localDate));
		Period preMonth = Period.ofMonths(-1);
		Period nextMonth = Period.ofMonths(1);
		System.out.println("前一月" + MonthFormat.format(localDate.plus(preMonth)));
		System.out.println("后一月" + MonthFormat.format(localDate.plus(nextMonth)));
	}

}
