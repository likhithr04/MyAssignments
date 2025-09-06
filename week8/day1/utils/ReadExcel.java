package week8.day1.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
          //                                 Login
	public static String[][] readData(String fileName) throws IOException {
		// Step1: To locate the workbook             Login
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");

		// Step2: To locate the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		// To count the number of rows
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("The number of rows including row1: " + physicalNumberOfRows);

		// To count the number of rows excluding row1
		int rowCount = ws.getLastRowNum();
		System.out.println("The number of rows excluding row1 " + rowCount);
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The column count is: " + columnCount);

		// To retreive a particular data
		String row1Cell1Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The data is: " + row1Cell1Data);

		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();

				data[i - 1][j] = allData;

			}

		}
		wb.close();
		return data;
	}

}
