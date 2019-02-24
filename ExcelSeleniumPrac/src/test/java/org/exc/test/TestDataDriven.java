package org.exc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\Excel Test Data Driven\\Test Demo.xlsx");
			
	         XSSFWorkbook workbook=new XSSFWorkbook(fis);
			int sheets=workbook.getNumberOfSheets();
			for(int i=0;i<sheets;i++)
			{
				if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
				{
					XSSFSheet sheet=workbook.getSheetAt(i);
					
					Iterator<Row> rows=sheet.iterator();
					   Row firstrow=rows.next();
					   Iterator<Cell> ce=firstrow.cellIterator();
					   int column=0;
					   int k=0;
					   while(ce.hasNext())
					   {
						   
						   Cell value=ce.next();
						   
						   if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
						   {
							   column=k;
							   
						   }
						   
						   k++;
					   }
					   
					   System.out.println(column);
					   while(rows.hasNext())
					   {
						   Row r=rows.next();
						   if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
						   {
							     Iterator<Cell> cv=r.cellIterator();
							     while(cv.hasNext())
							     {
							    	 System.out.println(cv.next().getStringCellValue());
							     }
						   }
					   }
				}
			} 
		            

	}

}
