package com.my;

import java.io.*;

public class SearchFile
{
	public static void find(File file, String filename)
	{
		if(file == null)
			return;
		
		if(!file.exists())
			return;
		if (file.isDirectory())
		{
			File[] files = file.listFiles();
			
			if(files == null)
				return;
			if(files.length == 0)
				return;
			
			for (File f : files)
			{
				find(f, filename);
			}
		} else if (file.getPath().endsWith(filename))
		{
			System.out.println(file.getPath());
		}
	}

	public static void main(String[] args)
	{

		String path = "D:\\Documents\\Pictures";
		String filename = ".gif";
		File file = new File(path);

		find(file, filename);
		System.out.println("Success");

	}
}