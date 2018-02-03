package com.newio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNewIO
{

	public static void main(String[] args)
	{

		FileSystem fileSystem = FileSystems.getDefault();

		System.out.println(fileSystem.getSeparator());
		System.out.println(fileSystem.getRootDirectories());
		// windows有多个目录
		// \
		// [C:\, D:\, E:\, F:\, G:\]

		Path path = Paths.get("c:/a/1.txt");

		// 先创建文件跟目录
		Path filePath = Paths.get("c:/", "a", "b", "c");

		System.out.println(path.getFileName());
		System.out.println(path.getParent());

		boolean isExist = Files.exists(path);

		if (!isExist)
		{
			try
			{
				filePath = Files.createDirectories(filePath);
				// path = Files.createFile(path);
				System.out.println("文件创建成功！");
			} catch (IOException e)
			{
				System.out.println("文件创建失败！");
			}
		} else
		{
			System.out.println("文件已存在！");
		}
	}

}
