package com.subex.javatraining.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Properties file reader...");
		
		File file = new File("data\\data.properties");
		FileInputStream fis =  new FileInputStream(file);
		Properties props = new Properties();
		props.load(fis);
		System.out.println(props.getProperty("name"));
		System.out.println(props.getProperty("mobile"));
		System.out.println(props.getProperty("address"));
		
		fis.close();
		
	}
}
