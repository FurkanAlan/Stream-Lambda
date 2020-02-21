package Codes_InterviewQuestions.first;

/*
go to Canvas-> java -> Modules -> Day61_Excel Reader
       2.  donwload "Apache POI Library" zip folder
       3.  unzip it and copy&past unzipped folder to desktop
       4.  Open Excel Application and Store the following data :
       	|   Name    |       Job Title       |   Salary      |
       	| your name |  your job Title       | your Salary   |
       	(If you don't have excel it's fine, just pay close attendtion to);
       5.  save it to desk top as TestData.xlsx
*/
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


class ExcellData{
	public static void main(String[] args) {
		
		String path="/Users/mevlutbilim/Desktop/ExcelData.xlsx";
		String sheet="Sheet1";
		
		Q25_Excell obj=new Q25_Excell(path, sheet);
		
		String data1=obj.readData(1, 0);
		System.out.println(data1);
		
	obj.writeData(1, 0,"Suleyman");
	
	String data2=obj.readData(1, 0);
	System.out.println(data2);
	
	
		
	}
}
/*create custom class that can read and write an excel file
	 		instance variables: String filepath;
	 							String SheetName;
	 							FileInputStream file;
	 							WorkBook excelfile;
	 							Sheet sheet;
	 							
	 							Cell cell;
	 							
	 		Actions: ReadData(int row, int cell)  ==> String
	 				 WriteData(int row, int cell,String setValue) ==> void
	 							 
 */


public class Q25_Excell {
		
	    String filepath;
		String SheetName;
		FileInputStream file;
		Workbook excelfile;
		Sheet sheet;
		Cell cell;
		public Q25_Excell(String filepath, String SheetName) {
			super();
			this.filepath = filepath;
			this.SheetName = SheetName;
			
			try {
			file=new FileInputStream(filepath);
			excelfile =WorkbookFactory.create(file);
			sheet=excelfile.getSheet(SheetName);
			
			} catch(IOException e) {
				
			}
			
			
		}
		
		public  String readData(int rowNum,int cellNum) {
			String data="";
			
			cell=sheet.getRow(rowNum).getCell(cellNum);
			data=cell.toString();
			
			return data;
			
		}
		
		
		public void writeData(int rowNum,int cellNum, String setValue) {
			cell=sheet.getRow(rowNum).getCell(cellNum);
			cell.setCellValue(setValue);
		}
		
		
}
