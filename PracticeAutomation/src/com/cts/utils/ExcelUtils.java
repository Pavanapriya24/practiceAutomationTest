package com.cts.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static String[][] getSheetIntoStringArray(String fileDetails, String sheetName) throws IOException {
		FileInputStream file = null;
		XSSFWorkbook book = null;
		String[][] main = null;

		try {

			file = new FileInputStream(fileDetails);

			book = new XSSFWorkbook(fileDetails);

			XSSFSheet sheet = book.getSheet(sheetName);
			// XSSFSheet sheet2 = book.getSheet("Sheet2");

			int rowCount = sheet.getPhysicalNumberOfRows();// rowCount
			System.out.println(rowCount);

			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.print(cellCount);
			main = new String[rowCount - 1][cellCount];
			DataFormatter format = new DataFormatter();
			for (int i = 1; i < rowCount; i++) {
				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j < cellCount; j++) {

					XSSFCell cell = sheet.getRow(i).getCell(j);

					String cellValue = format.formatCellValue(cell);
					System.out.println(cellValue);

					main[i - 1][j] = cellValue;

				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			book.close();
			file.close();

		}
		return main;
	}
}
