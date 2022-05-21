package utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		File src =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);//workbook madhi jate
		
	//    XSSFSheet sh1=wb.getSheet(sheet);
		XSSFSheet sh1=wb.getSheetAt(0);//sheet 1 jananr
		
		DataFormatter df =new DataFormatter();//string aso va value donhi ghenar
		
		String numericstring = df.formatCellValue(sh1.getRow(4).getCell(0));
		
		System.out.println(numericstring);
		
		
		
	}
}
