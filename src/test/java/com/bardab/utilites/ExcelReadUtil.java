package com.bardab.utilites;

import java.io.File;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadUtil {
	  public static String[][] readExcelInto2DArray(String excelFilePath, String sheetName, int totalCols) {

	    File file = new File(excelFilePath);

	    String[][] tabArray = null;

	    try {
	      OPCPackage opcPackage = OPCPackage.open(file.getAbsolutePath());

	      Workbook wb = WorkbookFactory.create(opcPackage);

	      Sheet sheet = wb.getSheet(sheetName);

	      int totalRows = sheet.getLastRowNum();
	      System.out.println("Total rows: "+ totalRows);
	    

	      tabArray = new String[totalRows][totalCols];

	      for (int i = 0; i <totalRows; i++) {
	        for (int j = 0; j < totalCols; j++) {
	          Cell cell = sheet.getRow(i+1).getCell(j);
	         
	          
	          
	          if (cell == null)
	            continue;

	          switch (cell.getCellType()) {
	          case Cell.CELL_TYPE_BOOLEAN:
	            tabArray[i][j] = String.valueOf(cell.getBooleanCellValue());
	            break;
	          case Cell.CELL_TYPE_NUMERIC:
	            tabArray[i][j] = new DataFormatter().formatCellValue(cell);
	            System.out.println( "======================Numeric value:" + new DataFormatter().formatCellValue(cell)); 
	            break;
	          case Cell.CELL_TYPE_STRING:
	        	
	            tabArray[i][j] = cell.getStringCellValue();
	            System.out.println( "======================String value:" + cell.getStringCellValue());
	            
	            break;
	          default:
	            tabArray[i][j] = "";
	            break;
	          }
	        }
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	      throw new RuntimeException(e);
	    }

	    return tabArray;
	  }

	}