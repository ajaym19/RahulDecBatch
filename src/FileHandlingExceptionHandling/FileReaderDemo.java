package FileHandlingExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/*
	 * Read a Book
	 * which book? ABC
	 * place of the book? Lib1
	 * 
	 * Problems:
	 * 1. Reading only one character
	 * 2. Returning ASCII 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		String filePath;
		filePath = "./src/FileHandlingExceptionHandling/TestData";
		FileReader reader = new FileReader(filePath);
	//	System.out.println((char)reader.read());
		int i;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("My Name");
		writer.close();
		
		
		
	}
}
