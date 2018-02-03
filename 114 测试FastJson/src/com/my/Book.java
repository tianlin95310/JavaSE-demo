package com.my;

public class Book
{
	public String bookName;
	public String bookPrice;
	public Book(String bookName, String bookPrice)
	{
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public Book()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	

}
