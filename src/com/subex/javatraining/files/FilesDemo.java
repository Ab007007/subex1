package com.subex.javatraining.files;

import java.io.File;

public class FilesDemo
{
	
	public static void main(String[] args) 
	{
		
		File folder = new File("D:\\subex_ws\\JavaTraining\\src\\com\\subex\\javatraining\\abstractdemo\\");
		
		System.out.println(folder.exists());
		System.out.println(folder.isFile());
		String[] programs = folder.list();
		
		for (String program : programs)
		{
			System.out.println(program);
			
		}
		
	}

}
