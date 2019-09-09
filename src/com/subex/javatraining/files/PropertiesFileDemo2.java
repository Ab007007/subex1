package com.subex.javatraining.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class PropertiesFileDemo2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Properties file reader...");
		
		File file = new File("data\\data1.properties");
		if(!file.exists())
		{
			System.out.println("Creating a new file");
			file.createNewFile();
		}
		FileOutputStream fos =  new FileOutputStream(file, true);
		Properties props = new Properties();
		for(int i=1;i<5;i++)
		{
			props.setProperty("dummy"+i, "123");
		}
		
		props.store(fos, "arg1");
		fos.flush();
		fos.close();
		
	}
}
