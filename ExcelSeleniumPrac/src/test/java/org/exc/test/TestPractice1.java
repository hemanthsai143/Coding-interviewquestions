package org.exc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestPractice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\Excel Test Data Driven\\Test Demo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		        int sheets=workbook.getNumberOfSheets();
		        for(int i=0;i<sheets;i++)
		        {
		        	
		        	if(workbook.getSheetName(i).equalsIgnoreCase("TestData")){
		        		     XSSFSheet sheet=workbook.getSheetAt(i);
		        		        Iterator<Row> rows=sheet.iterator();
		        		      Row firstRow=rows.next();
		        		      int column=0,k=0;
		        		         Iterator<Cell> cells=firstRow.cellIterator();
		        		         while(cells.hasNext())
		        		         {
		        		        	Cell value=cells.next();
		        		        	if(value.getStringCellValue().equalsIgnoreCase("TestData"))
		        		        	{
		        		        		column=k;
		        		        		System.out.println(column);
		        		        	}
		        		        	k++;
		        		        	
		        		         }
		        		
		        		         while(rows.hasNext())
		        		         {
		        		        	 Row r= rows.next();
		        		        	 
		        		        	 if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
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
