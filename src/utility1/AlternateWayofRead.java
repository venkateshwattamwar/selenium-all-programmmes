package utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlternateWayofRead {
	
	//alternate way of read when inserting in project

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"\\Book1.xlsx";
		File src =new File (path);//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);//workbook madhi jate
		
	//    XSSFSheet sh1=wb.getSheet(sheet);
		XSSFSheet sh1=wb.getSheetAt(0);//sheet 1 jananr
		
		DataFormatter df =new DataFormatter();//string aso va value donhi ghenar
		
		String numericstring = df.formatCellValue(sh1.getRow(5).getCell(0));
		
		System.out.println(numericstring);
		
		
		
	}
}
