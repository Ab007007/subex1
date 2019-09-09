package com.subex.javatraining.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingExceptionHandling {
	public static void main(String[] args) {

		File f = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		f = new File("data\\newfile.txt");
		try {
			if (!f.exists()) {
				f.createNewFile();
				System.out.println("Created a new file");
			}
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			for (int i = 0; i < 100; i++) {
				bw.write("line - " + i + " i'm from java program ");
				bw.newLine();

			}
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			}catch(Exception ex)
			{
				System.out.println("Error While Closing the writer");
			}
		
		}
	}

}
