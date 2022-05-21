package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader1 {

	public static void main(String[] args) throws IOException {
		
		File src =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);//workbook varti yeto
		
		XSSFSheet sh1=wb.getSheetAt(0);//sheet index ghetl mhnje sheet1 ghetal
//		XSSFSheet sh1 =wb.getSheet("sheet1");
		
		DataFormatter df =new DataFormatter();//String aso kiva no frk nhi padt
		
		String numericstring = df.formatCellValue(sh1.getRow(3).getCell(1));//
		
		System.out.println(numericstring);
		
		
		
	}
}
