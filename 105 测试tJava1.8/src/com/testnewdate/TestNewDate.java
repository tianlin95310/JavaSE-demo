package com.testnewdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class TestNewDate
{

	public static void main(String[] args)
	{
		// 新版时间戳
//		Clock clock = Clock.systemDefaultZone();
//		System.out.println(clock.millis());
//
//		// 旧版时间戳
//		Date date1 = new Date();
//		System.out.println(date1.getTime());

		// 获取各地方时区
		String[] strs = TimeZone.getAvailableIDs();
		System.out.println(strs);
		
		ZoneId china = ZoneId.systemDefault();
		System.out.println("china = " + china);
		
		// 日期 默认用横线分隔
		LocalDate date = LocalDate.now(china);
		System.out.println("date = " + date);
		
		// 时间 默认用横线分隔，秒钟含有微秒信息
		LocalTime time = LocalTime.now(china);
		System.out.println("time = " + time);
		
		// 日期时间
		LocalDateTime datetime = LocalDateTime.now(china);
		System.out.println(datetime);
		
		// 格式化详细时间
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String customer = format1.format(datetime);
		System.out.println(customer);
		
		// 格式化日期
		DateTimeFormatter formant2 = DateTimeFormatter.ofPattern("yyyy*MM*dd"); 
		System.out.println(formant2.format(date));
		
		// 格式化时间
		DateTimeFormatter formant3 = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		System.out.println(formant3.format(time));
	}

}
