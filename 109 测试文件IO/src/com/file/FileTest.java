package com.file;

import java.io.File;

public class FileTest
{
	public static void main(String[] args)
	{
		File file = new File("c:/cestbon/");
		file.mkdirs();
	}

}
