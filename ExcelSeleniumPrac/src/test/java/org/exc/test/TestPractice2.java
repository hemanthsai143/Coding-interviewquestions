package org.exc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestPractice2 {
	
	public void getData() throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\Excel Test Data Driven\\Test Demo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				   XSSFSheet sheet= workbook.getSheetAt(i);
				             Iterator<Row> rows=sheet.rowIterator();
				             Row firstrow=rows.next();
				             int k=0,column=0;
				             Iterator<Cell> ce=firstrow.cellIterator();
				             while(ce.hasNext())
				             {
				            	 Cell value=ce.next();
				            	 if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
				            		 column=k;
				        
				            	 }
				            	 k++;
				             }
				             
				       while(rows.hasNext()) {
				    	   Row row=rows.next();
				    	   
	                          
	                        	  if(row.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
	                        	  {
	                        		  Iterator<Cell> cv= row.cellIterator();
	                        		  while(cv.hasNext())
	                        		  {
	                        		
	                        			Cell c=cv.next();
	                        			if(c.getCellTypeEnum()==CellType.STRING)
	                        			{
	                                     System.out.println(c.getStringCellValue());
	                        			}
	                        			else
	                        			{
	                        			 System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
	                        			}
	                        	  }
	                        	  
	                          }
				       }
			}
		}
		
	}

}
