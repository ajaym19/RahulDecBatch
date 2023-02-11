package FileHandlingExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

	/*
	 * Exception:
	 * 
	 * try: any risky code which might throw exception catch: what to do if the
	 * exception occurs finally:
	 * 
	 * Types of Exception: 1. Compile Time (Checked Exception) 2. Run Time
	 * (Unchecked Exception)
	 */
	
	static String name;

	public static void main(String[] args) throws IOException{

	//	m1();
		System.out.println(1);
		String filePath = "./src/FileHandlingExceptionHandling/TestData1";
		try {
			// FileNotFoundException
			// IOException is parent of FileNotFoundException
			FileReader reader = new FileReader(filePath);
			reader.read();
			throw new IOException();
		} catch (FileNotFoundException obj) {
			System.out.println("Unable to read the data");
			System.out.println("I am in Catch Block");
			System.out.println("File Not Found!!!");
		} catch (IOException e) {
			System.out.println("I am IN IO Exception");
		} catch (Exception e) {
			System.out.println("I am IN IO Exception");
		} finally {
			System.out.println("CLosing the connection");
		}
		System.out.println(2);

		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("I am caught");
		}

		try {
			// FileNotFoundException
			// IOException is parent of FileNotFoundException
			FileReader reader = new FileReader(filePath);
			reader.read();
			System.out.println("I am in Try Block");
			System.out.println("Successfully read data");
		} catch (Exception obj) {
			System.out.println("Message "+obj.getMessage());
			System.out.println("Unable to read the data");
			System.out.println("I am in Catch Block");
			System.out.println("File Not Found!!!");
		}
		
		//unchecked exception
		int[] a = {1,2,3};
		//System.out.println(a[4]);
		
		//System.out.println(name.length());
		
		

	}
	
	public static void m1() throws IOException {
		String filePath = "./src/FileHandlingExceptionHandling/TestData1";
		FileReader reader = new FileReader(filePath);
		throw new IOException();
	}

}
