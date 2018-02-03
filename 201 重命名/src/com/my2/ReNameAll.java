package com.my2;

import java.io.File;

public class ReNameAll
{
	private static final String GIF = ".gif";
	
	private static int count = 0;
	public static void reName(File file, String head, String tail)
	{
	
		if(file == null)
			return;
		
		if(!file.exists())
			return;
		
		if(file.isDirectory())
		{
			File[] files = file.listFiles();
			
			if(files == null)
				return;
			
			if(files.length == 0)
				return;
			
			for(File f : files)
			{
				reName(f, head, tail);
			}
		}
		else if(file.isFile())
		{
			String name = file.getPath();
			
			String realName = "";
			count++;
			
			String strCount = String.format("%04d", count);
			
			// 得到父目录的名字，才能构造出新的file，将path与name分离出来
			if(name.endsWith(GIF))
				realName = file.getParent()  + "/" + head + strCount + ".gif";
			else
				realName = file.getParent() + "/" + head + strCount + tail;
			
			file.renameTo(new File(realName));
			
			System.out.println(strCount);
		}
	}
	public static void main(String[] args)
	{
		File file = new File("C:/Users/Administrator/Desktop/资源收集");
		reName(file, "sj", ".jpg");
		
		System.out.println("success");
	}

}
