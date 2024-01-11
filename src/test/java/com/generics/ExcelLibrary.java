package com.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstant
{
	public static String getStringTypcellData(String sheet, int row,int cell) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		String cellValue= wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;

	}
	public static double getNumericTypcellData(String sheet, int row,int cell) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		double cellValue= wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellValue;
	}
	public static boolean getBooleanTypcellData(String sheet, int row,int cell) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		boolean cellValue= wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return cellValue;
	}
	public static Date getDateTypcellData(String sheet, int row,int cell) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		Date cellValue= wb.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return cellValue;
	}
	public static CellAddress getCellAddress(String sheet, int row,int cell) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		CellAddress celladdress= wb.getSheet(sheet).getRow(row).getCell(cell).getAddress();
		return celladdress;
	}
	public static int rowCount(String sheet) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
	public static int cellCount(String sheet) throws IOException
	{
		FileInputStream fis= new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		int cellcount=0;
		for(int i=0; i<=rowcount; i++)
		{
			cellcount=wb.getSheet(sheet).getRow(i).getLastCellNum();
		}
		return cellcount;
	}
}
