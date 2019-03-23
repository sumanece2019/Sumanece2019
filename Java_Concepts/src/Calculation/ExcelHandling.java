package Calculation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException  {
		String filePath, fileName, sheetName;
		
		filePath = "C:\\Users\\mampi\\Desktop\\Selenium";
		fileName= "TestCases.xls";
		sheetName = "TestSteps";
	
		File file = new File(filePath+"\\"+fileName);
		FileInputStream fis = new FileInputStream(file);
		Workbook wBook = null;
		
		//*************Identify Excel File Extension*********************
		String fileExtension = fileName.substring(fileName.indexOf("."));
		if (fileExtension.equals(".xlsx"))
		{
			wBook = new XSSFWorkbook(fis);
		}
		else if (fileExtension.equals(".xls"))
		{
			wBook = new HSSFWorkbook(fis);
		}
	
		//*************Identify Excel File data along with No. of Sheets & No. of Rows*********************
		Sheet testSteps = wBook.getSheet(sheetName);
		int totalTestSteps = testSteps.getLastRowNum();
		
		System.out.println("Total no. of test steps: " + totalTestSteps);
		for (int i=1; i<=totalTestSteps;i++)
		{
			Row rows = testSteps.getRow(i);
			for (int j=0; j< rows.getLastCellNum();j++)
			{
				System.out.println(rows.getCell(j)+ "  ");
			}
			System.out.println();
		}


	    fis.close();
	}

}
