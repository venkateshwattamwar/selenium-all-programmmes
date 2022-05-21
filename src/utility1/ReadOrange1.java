package utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOrange1 {
	
	//method define kart ahot
	
	public static String readmethod(int row,int column) throws IOException
	{
		File src =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");//file path ghete
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);//workbook madhi jail
		
		XSSFSheet sh1= wb.getSheetAt(0);//sheet1 ghete
		
		DataFormatter df=new DataFormatter();
		
		String numericstring = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		return numericstring;
		
		
		
		
		
		
		
	}

}
