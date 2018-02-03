package com.my;

public class User
{
	public String username;
	public String password;
	
	public Book book;
	
	public User()
	{
		
	}

	public User(String username, String password, Book book)
	{
		super();
		this.username = username;
		this.password = password;
		this.book = book;
	}

	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", book=" + book + "]";
	}
	
	

	

}
