package com.my;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReName
{
	public static void reName(File dir,String fileName,String type)
	{
		
		if(dir == null || dir.length() == 0)
			return ;
		
		File[] files = dir.listFiles();
		
		for(int i = 0 ; i < files.length; i++)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String time = sdf.format(new Date());
			
			String number = String.format("%03d", (i + 1));
			String name = dir + 
					"/" + 
					fileName + 
					time + 
					"in" + 
					number + 
					type;
			
			boolean bool = files[i].renameTo(new File(name));
			
			System.out.println(name);
		}
		return ;
	}
	public static void main(String[] args)
	{
		String folder = "D:\\Documents\\Msn\\vapart";
		
		String fileName = "vapart";
		
		String fileType = ".mp4";
		
		File file = new File(folder);
		
		reName(file, fileName, fileType);
		System.out.println("success");
	}

}
