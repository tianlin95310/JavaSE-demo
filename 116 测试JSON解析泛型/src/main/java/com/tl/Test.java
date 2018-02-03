package com.tl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

class Book
{
	public String bid;
	public String bname;
	@Override
	public String toString()
	{
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
}
class People
{
	public String pname;
	
	public String pid;
	
	public List<Book> books;

	@Override
	public String toString()
	{
		return "People [pname=" + pname + ", pid=" + pid + ", books=" + books + "]";
	}
	
}
public class Test
{

	public static void main(String[] args)
	{
		
		testRemoveKey();
		
	}

	private static void testRemoveKey()
	{
		String json = makePeople();
		System.out.println("json = " + json);
		
//		// 只有当json对应的是一个数组类型才能进行转化
//		JSONArray jsonArray =JSON.parseArray(json);
//		System.out.println("-----------------------jsonArray" + jsonArray);
		
//		// JSONObject对应一个HashMap，每一个属性对应Map的一个key
		JSONObject jsonObject = JSON.parseObject(json);
//		System.out.println("pid = " + jsonObject.containsKey("pid"));
//		System.out.println("pid = " + jsonObject.containsKey("pname"));
//		System.out.println("pid = " + jsonObject.containsKey("books"));
//		// 不包含某个属性的属性
//		System.out.println("pid = " + jsonObject.containsKey("bid"));
//		System.out.println("pid = " + jsonObject.containsKey("bname"));
		
		JSONArray jsonArray = jsonObject.getJSONArray("books");
		
		for(int i = 0; i < jsonArray.size(); i++)
		{
			JSONObject object = (JSONObject) jsonArray.get(i);
			object.remove("bid");
		}
		
//		jsonObject.remove("pid");
		
		System.out.println("jsonObject = " + jsonObject.toJSONString());
		
		// 在Java里以下两种方式都可以将json字符串转换成目标对象
//		People people = JSON.parseObject(json, People.class);
//		People people = JSON.parseObject(json, new TypeReference<People>(){}.getType());
//		System.out.println("-----------------------" + people);
	}

	private static String makePeople()
	{
		People people = new People();
		people.pid = "1001";
		people.pname = "tianlin";
		
		List<Book> books = new ArrayList<>();
		
		for(int i = 1; i <= 2; i++)
		{
			Book book = new Book();
			book.bid = "1000000" + i;
			book.bname = "book" + i;
			books.add(book);
		}
		
		people.books = books;
		
		return JSON.toJSONString(people);
	}

}
