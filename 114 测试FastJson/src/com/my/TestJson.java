package com.my;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class TestJson
{

	public static void main(String[] args)
	{

		// User user1 = new User("111", "111");
		//
		// String json = JSON.toJSONString(user1);
		//
		// System.out.println(json);
		//
		// User user2 = JSON.parseObject(json, User.class);
		//
		// System.out.println(user2);

		new TestJson().testTemplet();
		//
	}

	private void testTemplet()
	{
		
		// {}一个对象
		// []数组
		Map<String, User> map = new HashMap<String, User>();

		{
			// 1,传入一个空的集合，得到的json是{}
			System.out.println(JSON.toJSONString(map));
		}

		{
			// 2,传入一个空的对象，得到的json为null
			Map<String, User> map2 = null;
			
			System.out.println(JSON.toJSONString(map2));
		}

		{
			// 3,传入一个对象，得到的json为{}，没有赋值的属性不会显示在json中
			Book b = new Book();
			b.bookName = "aaa";
			System.out.println(JSON.toJSONString(b));
		}
		
		{
			// 4,传入一个空的自定义对象，得到的json为null
			Book b = null;
			System.out.println(JSON.toJSONString(b));
		}
		
		{
			// 5,传入一个空的对象，得到的json为null
			String str = null;
			String json = JSON.toJSONString(str);
			System.out.println(json);
		}
		
		Book book1 = new Book("qqq", "111");
		Book book2 = new Book("www", "222");
		Book book3 = new Book("eee", "333");

		User user1 = new User("tianlin", "tianlin", book1);
		User user2 = new User("tianlin", "tianlin", book2);
		User user3 = new User("tianlin", "tianlin", book3);

		map.put("1", user1);
		map.put("2", user2);
		map.put("3", user3);
		// {
		// String json = JSON.toJSONString(map);
		// System.out.println(json);
		// /**
		// * json转泛型
		// */
		// Map<String, User> map1 = JSON.parseObject(json, new
		// TypeReference<Map<String, User>>()
		// {
		// }.getType());
		// System.out.println(map1.toString());
		// }

		{

		}
	}

}
