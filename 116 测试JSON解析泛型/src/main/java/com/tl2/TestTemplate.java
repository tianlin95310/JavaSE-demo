package com.tl2;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

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
class People1
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

class People2<T>
{
	public String pname;
	public String pid;
	public T books;
	@Override
	public String toString()
	{
		return "People2 [pname=" + pname + ", pid=" + pid + ", books=" + books + "]";
	}
	
	
}
public class TestTemplate
{

	private static String makePeople()
	{
		People1 people = new People1();
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
	
	public static void main(String[] args)
	{
		
		String json1 = makePeople();
		System.out.println(json1);
		System.out.println(JSON.parseObject(json1, People1.class));
		System.out.println(JSON.parseObject(json1, new TypeReference<People1>(){}.getType()));
		
		String json2 = makePeople2();
		System.out.println(json2);
		System.out.println(JSON.parseObject(json2, People2.class).books.getClass().getName());
		System.out.println(JSON.parseObject(json2, new TypeReference<People2<List<Book>>>(){}.getType()));
	}

	private static String makePeople2()
	{
		People2<List<Book>> people = new People2<>();
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
