package com.subex.javatraining.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		String line = null;
		/*
		 * File file = new File("data\\abc.txt"); FileReader fr = new FileReader(file);
		 * BufferedReader br = new BufferedReader(fr);
		 */
		
		BufferedReader br =  new BufferedReader(new FileReader(new File("data\\abc.txt")));
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	//	fr.close();
		
	}
}
