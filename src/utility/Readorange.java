package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readorange {
	//read and write data
	
	public static String readmethod(int row, int column) throws IOException
	{
File src =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);//workbook varti yeto
		
		XSSFSheet sh1=wb.getSheetAt(0);//sheet index ghetl
//		XSSFSheet sh1 =wb.getSheet("sheet1");
		
		DataFormatter df =new DataFormatter();
		
		String numericstring = df.formatCellValue(sh1.getRow(row).getCell(column));//String written katey
		
		System.out.println(numericstring);
		
		return numericstring;
		
		
	}

}
