package com.subex.javatraining.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		
		File f =  new File("data\\newfile.txt");
		
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("Created a new file");
		}
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < 100; i++) {
			bw.write("line - " + i + " i'm from java program ");
			bw.newLine();
			
		}
		bw.close();
		fw.close();
	}

}
