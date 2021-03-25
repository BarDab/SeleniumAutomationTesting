package com.bardab.utilites;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadUtil {
	

	
	 public static String[][] readExcelSheetInto2DArray(String excelFilePath, String sheetName, int totalCols) {

	  return readFromExcelSheet(getSheetFromWorkBook(sheetName, createWorkBookFromExcelFile(excelFilePath)),totalCols);
	   
	 }
	 
	 
	 public static String [][] readFromExcelSheetWithoutFirstRow(String excelFilePath, String sheetName, int totalCols) {
		 return Arrays.copyOfRange(readExcelSheetInto2DArray(excelFilePath,sheetName, totalCols), 1, readExcelSheetInto2DArray(excelFilePath,sheetName, totalCols).length);
	 }
	  
	  private static String [][] readFromExcelSheet(Sheet sheet, int totalCols) {
			int totalRows = sheet.getPhysicalNumberOfRows(); 
			String [][] tabArray = new String[totalRows][totalCols];
		
			for (int i = 0; i <totalRows; i++) { 
	    	tabArray[i]= getAllCellsAsStringValuesFromRow(totalCols,i,sheet);
	    	}	
	   return tabArray;
		
	}
	
	private static String[] getAllCellsAsStringValuesFromRow(int numberOfColumns, int rowNumber, Sheet sheet) {
	String [] cellValuesInRow = new String [numberOfColumns];
	for (int j = 0; j < numberOfColumns; j++) {
         cellValuesInRow [j] = new DataFormatter().formatCellValue((sheet.getRow(rowNumber)).getCell(j));
     	
        }
	return cellValuesInRow;
}
	
	
	  private static Sheet getSheetFromWorkBook(String sheetName, Workbook wb) {
		return wb.getSheet(sheetName);
	}
	  
	  private static Workbook createWorkBookFromExcelFile(String excelFilePath) {
			try {
				return WorkbookFactory.create(createOPCPackageFromFile(getFile(excelFilePath)));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

	
	private static OPCPackage createOPCPackageFromFile(File file) {
		try {
			return OPCPackage.open(file.getAbsolutePath());
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static File getFile(String excelFilePath) {
		return new File(excelFilePath);
	}
	
	
}



