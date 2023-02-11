package FileHandlingExceptionHandling;

import java.io.IOException;

import ExcelReaderHandling.ExcelReaderDemo;

public class ExcelReader {

	/*
	 * <dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.4.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.3.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.4.0</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.3</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>
	</dependencies>
	 */
	
	/*
	 * /*
	 * Apache POI
	 * 1. Name and location of the file 
	 * 2. XSSFWorkbook: to access the workbook
	 * 3. XSSFSheet: to get the sheet
	 * 4. Identify the no of rows
	 * 5. Identify the no of columns
	 * 6. Read the data
	 * 
	 */

//	public Object[][] getData() throws IOException {
//		String filePath = "./src/test/java/ExcelReaderHandling/TestData.xlsx";
//		XSSFWorkbook wb = new XSSFWorkbook(filePath);
//		XSSFSheet sheet = wb.getSheet("data");
//		int rowCount = sheet.getPhysicalNumberOfRows();
//		int colCount = sheet.getRow(0).getLastCellNum();
//		Object[][] data = new Object[rowCount][colCount];
//		
////		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
////		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
////		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
////		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
////		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
////		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
////		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
////		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());
//		
//		for (int row = 0; row < rowCount; row++) {
//			for (int col = 0; col < colCount; col++) {
//				data[row][col] = sheet.getRow(row).getCell(col).getStringCellValue();
//				//CellType celltype = sheet.getRow(row).getCell(col).getStringCellValue();
//				//System.out.println(celltype.name());
//			}
//		}
//		
//		return data;
//		
//	}
	
	
//	public class App {
//
//		public static void main(String[] args) throws IOException {
//			ExcelReaderDemo reader = new ExcelReaderDemo();
//			reader.getData();
//		}
//	}
	 
}
