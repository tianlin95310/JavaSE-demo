package com.new_try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test
{

	public static void main(String[] args)
	{
		try (
				// 自动释放资源的写法
				InputStream is = new FileInputStream(new File(""));
				)
		{

		} catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
			return;
		} catch (IOException e1)
		{
			System.out.println("IOException");
		}
		finally 
		{
			System.out.println("finally");
		}
		
		System.out.println("end");

	}

}
